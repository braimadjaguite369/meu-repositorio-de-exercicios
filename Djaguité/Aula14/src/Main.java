public class Main {

    public static void main(){
        Vidio[] vidio = new Vidio[2];

        vidio[0] = new Vidio("Curso em video.");
        vidio[1] = new Vidio("POO");
        System.out.println(vidio[0].toString());
        System.out.println(vidio[1].toString());
        Gafanhoto[] gaf = new Gafanhoto[2];
        gaf[0] = new Gafanhoto("Djaguite", 20, "M", "amora");
        gaf[1] = new Gafanhoto("Braima", 21, "M", "saber");
        System.out.println(gaf[0].toString());
        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(gaf[0], vidio[0]);
        vis[1] = new Visualizacao(gaf[1], vidio[0]);
        vis[2] = new Visualizacao(gaf[0], vidio[1]);
        vis[0].avaliar();
        vis[1].avaliar();
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}