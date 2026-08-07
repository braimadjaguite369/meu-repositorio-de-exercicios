//18/02/2026
//Braima Djaguité
//Engenharia Informatica
//ESTG
public class Main{
    public void main(){
        Lutador[] L = new Lutador[6];
        L[0] = new Lutador("DJAGUITE", "guineese", 21, 1.80f,
                65, 12, 1, 0);
        L[1] = new Lutador("Amade", "guineese", 23, 1.70f,
                60, 10, 2, 1);

       Luta  UEC = new Luta();
       UEC.marcarLuta(L[0], L[1]);
       UEC.lutar();
       L[0].status();
       L[1].status();
    }
}