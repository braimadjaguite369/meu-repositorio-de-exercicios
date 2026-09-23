import math
import networkx as nx
import numpy as np
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.pyplot as plt

# =========================================================
# FUNÇÃO DISTÂNCIA 3D
# =========================================================

def calcular_distancia(p1, p2):

    x1, y1, z1 = p1
    x2, y2, z2 = p2

    return math.sqrt((x2 - x1)**2 + (y2 - y1)**2 + (z2 - z1)**2)


# =========================================================
# CONSTRUÇÃO DO GRAFO
# =========================================================

def criar_grafo(pontos):

    G = nx.Graph()

    # adicionar vértices
    for i in range(len(pontos)):
        G.add_node(i, pos=pontos[i])

    # adicionar arestas válidas
    for i in range(len(pontos)):

        for j in range(i + 1, len(pontos)):

            distancia = calcular_distancia(pontos[i], pontos[j])

            if 7 < distancia < 10:

                G.add_edge(
                    i,
                    j,
                    weight=round(distancia, 2)
                )

    return G



# =========================================================
# MATRIZES
# =========================================================

def gerar_matrizes(G, pontos):

    n = len(pontos)

    # matriz de adjacência
    matriz_adj = nx.to_numpy_array(G, nodelist=range(n), weight=None)

    # matriz de distâncias
    matriz_dist = np.zeros((n, n))

    for i in range(n):

        for j in range(n):

            if i != j:

                matriz_dist[i][j] = round( calcular_distancia(pontos[i], pontos[j]), 2)

    return matriz_adj, matriz_dist


# =========================================================
# Imprimir matrizes
# =========================================================

def imprimir_matrizes(matriz_adj, matriz_dist):

    print("\n========== ALÍNEA A ==========\n")

    np.set_printoptions(
        linewidth=200,
        threshold=np.inf
    )

    print("MATRIZ DE ADJACÊNCIA:\n")
    print(matriz_adj.astype(int))

    print("\nMATRIZ DE DISTÂNCIAS:\n")
    print(np.round(matriz_dist, 2))


# =========================================================
#Gerar a representação gráfica do grafo
# =========================================================
def desenhar_grafo_3d(G):

    fig = plt.figure(figsize=(12, 10))
    ax = fig.add_subplot(111, projection='3d')

    posicoes = nx.get_node_attributes(G, 'pos')

    # desenhar vértices
    for v, (x, y, z) in posicoes.items():

        ax.scatter(x, y, z)

        ax.text(
            x,
            y,
            z,
            f"v{v}",
            fontsize=8
        )

    # desenhar arestas
    for u, v in G.edges():

        x = [posicoes[u][0], posicoes[v][0]]
        y = [posicoes[u][1], posicoes[v][1]]
        z = [posicoes[u][2], posicoes[v][2]]

        ax.plot(x, y, z)

    ax.set_title("Representação 3D do Grafo")

    ax.set_xlabel("X")
    ax.set_ylabel("Y")
    ax.set_zlabel("Z")

    plt.savefig(
        "grafo_3d.png",
        dpi=300,
        bbox_inches="tight"
    )

    plt.show()


# =========================================================
# ALÍNEA B
# CLASSIFICAÇÃO, GRAUS E TEOREMA 1
# =========================================================

def analisar_grafo(G, matriz_adj):

    print("\n========== ALÍNEA B ==========")

    # classificação

    print("Classificação do grafo:")
    print("- Simples")
    print("- Não orientado")
    print("- Ponderado")

    n = len(matriz_adj)

    graus = []

    print("\nGraus dos vértices:")

    for i in range(n):

        grau = int(sum(matriz_adj[i]))
        graus.append(grau)

        print(f"v{i}: {grau}")

    numero_arestas = G.number_of_edges()

    soma_graus = sum(graus)

    print(f"\nNúmero de arestas = {numero_arestas}")

    print("\nVerificação do Teorema 1:")

    print(f"Soma dos graus = {soma_graus}")
    print(f"2 x |E| = {2 * numero_arestas}")

    if soma_graus == 2 * numero_arestas:
        print("Teorema 1 verificado.")
    else:
        print("Teorema 1 NÃO verificado.")


# =========================================================
# ALÍNEA C
# CONEXIDADE E CAMINHOS
# =========================================================

def analisar_conexidade(G, origem, destino):

    print("\n==============================")
    print("ALÍNEA C")
    print("==============================")

    # Lista ordenada dos vértices
    vertices = sorted(G.nodes())
    indice = {v: i for i, v in enumerate(vertices)}

    # Matriz de adjacência
    M = np.array(
        [[1 if G.has_edge(v1, v2) else 0 for v2 in vertices]
         for v1 in vertices],
        dtype=int
    )

    n = len(vertices);

    # -------------------------------
    # Fecho transitivo
    # Ft = M + M² + ... + M^(n-1)
    # -------------------------------

    fecho = np.zeros((n, n), dtype=int)

    for k in range(1, n+1):
        fecho += np.linalg.matrix_power(M, k)

    # Verificação da conexidade

    if np.all(fecho != 0):

        print("\nO grafo é conexo.")

    else:

        print("\nO grafo é desconexo.")

   # -------------------------------------
   # Número de caminhos de comprimento c
   # (Teorema 5)
   # -------------------------------------

    c = 4   # comprimento pretendido

    i = indice[origem]
    j = indice[destino]

   # Calcula M^c
    Mc = np.linalg.matrix_power(M, c)

    print(f"\nMatriz M^{c}:\n")

    print(Mc)

    numero_caminhos = Mc[i][j]

    print(
    f"\nNúmero de caminhos de comprimento {c} "
    f"entre {origem} e {destino}: "
    f"{numero_caminhos}"
   )

# =========================================================
# ALÍNEA D
# CAMINHOS DE EULER
# =========================================================

def verificar_euler(G):

    print("\n==============================")
    print("ALÍNEA D")
    print("==============================")

    graus = dict(G.degree())

    impares = []

    for vertice, grau in graus.items():

        if grau % 2 != 0:

            impares.append(vertice)

    print(
        f"\nNúmero de vértices com grau ímpar: "
        f"{len(impares)}"
    )

    if len(impares) == 0:

        print("Existe circuito de Euler.")

    elif len(impares) == 2:

        print("Existe caminho de Euler.")

    else:

        print("Não existe caminho de Euler.")



# =========================================================
# ALÍNEA E
# ORE E DIRAC
# =========================================================

def verificar_hamiltoniano(G):

    print("\n========== ALÍNEA E ==========")

    n = G.number_of_nodes()

    graus = dict(G.degree())

    # DIRAC

    dirac = True

    for grau in graus.values():

        if grau < n / 2:
            dirac = False
            break

    if dirac:
        print("Teorema de Dirac verificado.")
    else:
        print("Teorema de Dirac não verificado.")

    # ORE

    ore = True

    for u in G.nodes():

        for v in G.nodes():

            if u != v and not G.has_edge(u, v):

                if graus[u] + graus[v] < n:

                    ore = False
                    break

        if not ore:
            break

    if ore:
        print("Teorema de Ore verificado.")
    else:
        print("Teorema de Ore não verificado.")



# =========================================================
# ALÍNEA F
# DIJKSTRA (FORMATO DOS SLIDES)
# =========================================================

def nome(v):
    return f"v{v}"

def dijkstra(G, origem, destino):

    print("\n========== ALÍNEA F ==========\n")

    M = set()

    X = []
    Xd = []
    R = []

    vd = origem
    Mc = [origem]

    print(
        f"{'It':<4}"
        f"{'vd(M)':<20}"
        f"{'Mc':<20}"
        f"{'A':<20}"
        f"{'vi,...,vd,vj e L(vj)':<50}"
        f"{'X':<20}"
        f"{'Xd':<20}"
        f"{'R'}"
    )

    print("-" * 220)

    it = 0

    while True:

        # -----------------------------------
        # determinar A
        # -----------------------------------

        A = []

        for vizinho in G.neighbors(vd):

            if vizinho not in M:

                A.append(vizinho)

        calculos = []

        # -----------------------------------
        # atualizar X, Xd e R
        # -----------------------------------

        custo_vd = 0

        if it > 0:

            for i in range(len(R)):

                if R[i] == Mc:

                    custo_vd = Xd[i]
                    break

        for vizinho in A:

            peso = G[vd][vizinho]["weight"]

            if it == 0:

                novo_custo = peso

            else:

                caminho_vd = Mc[:-1]

                custo_vd = 0

                for i in range(len(R)):

                    if R[i] == caminho_vd:

                        custo_vd = Xd[i]
                        break

                novo_custo = (
                    sum(
                        G[Mc[k]][Mc[k + 1]]["weight"]
                        for k in range(len(Mc) - 1)
                    )
                    + peso
                )

            novo_caminho = Mc + [vizinho]

            calculos.append(
                f"{'->'.join(nome(v) for v in novo_caminho)}"
                f" -> L({nome(vizinho)})={novo_custo:.2f}"
            )

            if vizinho in X:

                pos = X.index(vizinho)

                if novo_custo < Xd[pos]:

                    Xd[pos] = novo_custo
                    R[pos] = novo_caminho

            else:

                X.append(vizinho)
                Xd.append(novo_custo)
                R.append(novo_caminho)

        # -----------------------------------
        # imprimir linha atual
        # -----------------------------------

        texto_m = (
            "{"
            + ",".join(nome(v) for v in sorted(M))
            + "}"
        )

        texto_a = (
            "{"
            + ",".join(nome(v) for v in A)
            + "}"
        )

        texto_x = (
            "{"
            + ",".join(nome(v) for v in X)
            + "}"
        )

        texto_xd = (
            "{"
            + ",".join(f"{d:.2f}" for d in Xd)
            + "}"
        )

        texto_r = " ; ".join(
            "->".join(nome(v) for v in caminho)
            for caminho in R
        )

        print(
            f"{it:<4}"
            f"{(nome(vd)+' '+texto_m):<20}"
            f"{'->'.join(nome(v) for v in Mc):<20}"
            f"{texto_a:<20}"
            f"{'; '.join(calculos):<50}"
            f"{texto_x:<20}"
            f"{texto_xd:<20}"
            f"{texto_r}"
        )

        # -----------------------------------
        # adicionar vd a M
        # -----------------------------------

        M.add(vd)

        # -----------------------------------
        # remover vd de X caso exista
        # -----------------------------------

        if vd in X:

            pos = X.index(vd)

            X.pop(pos)
            Xd.pop(pos)
            R.pop(pos)

        # -----------------------------------
        # condição de paragem
        # -----------------------------------

        if vd == destino:

            print("\nCAMINHO MÍNIMO:")

            print(
                " -> ".join(
                    nome(v)
                    for v in Mc
                )
            )

            distancia_total = sum(
                G[Mc[k]][Mc[k + 1]]["weight"]
                for k in range(len(Mc) - 1)
            )

            print(
                f"Distância total = {distancia_total:.2f}"
            )

            return

        if len(X) == 0:

            print("\nNão existe caminho.")
            return

        # -----------------------------------
        # escolher novo vd
        # -----------------------------------

        indice_min = Xd.index(min(Xd))

        vd = X[indice_min]
        Mc = R[indice_min]

        it += 1


# =========================================================
# MAIN
# =========================================================
def main():

    pontos = [
    (0.0, 10.0, 5.0), (5.0, 5.0, 0.0), (10.0, 0.0, 5.0),
    (5.0, -5.0, 10.0), (10.0, -10.0, 15.0), (5.0, -10.0, 15.0),
    (5.0, -5.0, 5.0), (5.0, -15.0, 10.0), (-5.0, 5.0, 5.0),
    (0.0, 5.0, 5.0), (10.0, -5.0, 0.0), (5.0, 0.0, 10.0),
    (10.0, -15.0, 5.0), (-5.0, 15.0, 0.0), (10.0, -5.0, 15.0),
    (10.0, -10.0, 10.0), (5.0, -10.0, 5.0), (0.0, 5.0, 0.0),
    (10.0, 10.0, 0.0), (5.0, -15.0, 0.0), (5.0, 0.0, 0.0),
    (5.0, -15.0, 15.0), (10.0, 15.0, 5.0), (-5.0, 10.0, 0.0),
    (10.0, -5.0, 5.0)
]

    G = criar_grafo(pontos)

    matriz_adj, matriz_dist = gerar_matrizes(G, pontos)
    desenhar_grafo_3d(G)

    imprimir_matrizes(matriz_adj, matriz_dist)
    print("\n Ceguei aqui");

    analisar_grafo(G, matriz_adj)

    analisar_conexidade(G, origem=0, destino=24)

    verificar_euler(G)

    verificar_hamiltoniano(G)

    dijkstra(G, origem=0, destino=24)
if __name__ == "__main__":
    main()    

