package Enums;

public enum TrilerType {
   BASCULANTE("Basculante"), ABERTO("Aberto"), FECHADO("Fechado"), FRIGORIFICO("Frigorifico");

   private String descricao;
   TrilerType (String descricao){
      this.descricao = descricao;
   }

   @Override
   public String toString() {
      return this.descricao;
   }
}
