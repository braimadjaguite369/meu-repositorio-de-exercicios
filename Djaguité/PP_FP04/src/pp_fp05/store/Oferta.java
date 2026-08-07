package pp_fp05.store;

import pp_fp05.cd.Cd;

public class Oferta {
     protected static int nextId = 1;
     protected int id;
     protected String data;
     protected Cd[] cd;
     protected double valorFinal;

     public Oferta(String data, Cd[] cd) {
          this.data = data;
          this.id = nextId++;
          this.cd = cd;
          calculo();
     }
     private void calculo(){
          this.valorFinal = 0;
          for(int i = 0; i < cd.length; i ++){
               if(this.cd[i] != null){
                    this.valorFinal += this.cd[i].preco;
               }
          }
     }
     public void apresentar(){
          System.out.println(data);
          System.out.println(this.id);
          System.out.println(this.valorFinal);
     }
}
