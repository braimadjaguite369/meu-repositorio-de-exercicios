package pp_fp05.cd;

import pp_fp05.store.Oferta;

import javax.xml.transform.sax.SAXSource;

public class CdDemo {
    public static void main(String[] arg) {
        Artist a1 = new Artist("Calema", "Sao", "1992-12-21");
        Artist a2 = new Artist("Calemass", "Sao-Tome", "1992-12-21");
        Artist[] artistas = {a1, a2};
        Cd cd1 = new Cd("Calema", "Para sempre", 29000, 2019, "Kanafistra", artistas, 100);
        cd1.musicas[0] = new Musica(1, "O amor falou", 180);
        cd1.musicas[0].autores[0] = new Autor("Calema", "Vendedor", 30, "Portugal", 5, 123);
        cd1.musicas[0].autores[1] = new Autor("Calema", "Vendedor", 32, "Portugal", 7, 231);
        cd1.musicas[14] = new Musica(2, "Dan Bu Number", 200);
        cd1.musicas[14].autores[0] = new Autor("As One", "Gratis", 30, "Portugal", 10, 143);

        Oferta of = new Oferta("2026", new Cd[]{cd1});
        of.apresentar();

        /*System.out.println(cd1.nomeBanda);
        System.out.println(cd1.nomeCd);
        System.out.println(cd1.tempoTotal);
        System.out.println(cd1.ano);
        System.out.println(cd1.editor);
        for(int i = 0; i < artistas.length; i++){
            System.out.println(artistas[i].nome);
            System.out.println(artistas[i].nacionalidade);
            System.out.println(artistas[i].dataNasc);
        }


        int tam = cd1.musicas.length;
        for(int i = 0; i < tam; i++){
            if(cd1.musicas[i] != null){
                System.out.println("-------- Dados da " + (i + 1) + "ª musica--------");
               System.out.println("Nome da faixa: " + cd1.musicas[i].nomeFax);
               System.out.println("Numero: " + cd1.musicas[i].numeroFax);
               System.out.println("Duraçao" + cd1.musicas[i].duracao);
                System.out.println("-----------AUTOR/es-------------");
               for(int j = 0; j < cd1.musicas[i].autores.length; j++){
                   if(cd1.musicas[i].autores[j]!= null){
                       System.out.println("--------- Dados do " + (j + 1) + "º autor---------");
                       System.out.println("Nome do " + cd1.musicas[i].autores[j].nome);
                       System.out.println("Idade: " + cd1.musicas[i].autores[j].idade);
                       if(cd1.musicas[i].autores[j].tipo.equals("Vendedor")){
                           System.out.println("Morada: " + cd1.musicas[i].autores[j].morada);
                           System.out.println("NIF: " + cd1.musicas[i].autores[j].nif);
                           System.out.println("NIB: " + cd1.musicas[i].autores[j].nib);
                       }
                   }
               }
            }
        }*/
    }
}
