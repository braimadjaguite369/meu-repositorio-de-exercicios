package triler;

public class Triler {
     private int numEixos;
     private int capacidade;

     public Triler(int numEixos, int capacidade) {
          this.numEixos = numEixos;
          this.capacidade = capacidade;
     }
     public Triler(int capacidade) {
          this.numEixos = 2;
          this.capacidade = capacidade;
     }

     public int getNumEixos() {
          return numEixos;
     }

     public void setNumEixos(int numEixos) {
          this.numEixos = numEixos;
     }

     public int getCapacidade() {
          return capacidade;
     }

     public void setCapacidade(int capacidade) {
          this.capacidade = capacidade;
     }

     @Override
     public String toString() {
          return "Triler { " + "numEixos = " + numEixos + ", capacidade = " + capacidade + '}';
     }
}
