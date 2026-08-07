public class ContaBanco {
   public int numeroConta;
   public String tipo;
   protected String nomeDono;
   private float saldo;
   private boolean status;

   public ContaBanco(){
       this.setStatus(false);
       this.setSaldo(0.0f);
   }
   public int getNumeroConta(){
       return this.numeroConta;
   }
   public void setNumeroConta(int numero){
       this.numeroConta = numero;
   }
   public String getTipo(){
       return this.tipo;
   }
   public void setTipo(String tipo){
       this.tipo = tipo;
   }
   public String getNomeDono(){
       return this.nomeDono;
   }
   public void setNomeDono(String nome){
       this.nomeDono = nome;
   }
   public float getSaldo(){
       return this.saldo;
   }
   public void setSaldo(float saldo){
       this.saldo = saldo;
   }
   public boolean getStatus(){
       return this.status;
   }
   public void setStatus(boolean status){
       this.status = status;
   }
   public void abrirConta(String t, String nome){
       this.setNomeDono(nome);
       this.setStatus(true);
       this.setTipo(t);
       if(t.equals("CC")){
           this.setSaldo(50);
       } else if(t.equals("CP")){
           this.setSaldo(150);
       }
       System.out.println("Conta aberta com sucesso!");
   }
   public void fecharConta(){
       if(this.getStatus()){
           if(this.getSaldo() > 0){
               System.out.println("Ainda tens dinheiro na conta.");
           } else if(this.getSaldo() < 0){
               System.out.println("Tens debito na conta, precisa liquidar ainda");
           } else{
               this.setStatus(false);
               System.out.println("Conta fechada com sucesso!");
           }
       }
   }
   public void depositarSaldo(float saldo){
       if(this.getStatus()){
           setSaldo(this.getSaldo() + saldo);
           System.out.println("Deposita realizado na conta de " + this.getNomeDono());
       } else{
           System.out.println("A sua conta nao esta ativa, impossivel depositar!");
       }
   }
   public void sacarDinheiro(float montante){
       if(getStatus()){
           if(this.getSaldo() >= montante){
               this.setSaldo(this.getSaldo() - montante);
               System.out.println("Saque realizaso na conta " + getNumeroConta());
           } else{
               System.out.println("Saldo insuficiente para saque.");
           }
       } else{
           System.out.println("Impossivel realizar o saque, a conta esta inativa.");
       }
   }
   public void pagarMensalidade(){
       float valor = 0;
       if(this.getTipo().equals("CC")){
           valor = 12.0f;
       } else if(this.getTipo().equals("CP")){
           valor = 20.0f;
       }
       if(this.getStatus()){
           setSaldo(getSaldo() - valor);
           System.out.println("Mensalidade paga com sucesso!");
       } else{
           System.out.println("Impossivel efetuar o pagamento, a conta esta fechada.");
       }
   }
   public void statoAtual(){
       System.out.println("--------------------------------------");
       System.out.println("Numero da conta: " + this.getNumeroConta());
       System.out.println("Nome do titular: " + this.getNomeDono());
       System.out.println("Tipo de conta: " + this.getTipo());
       System.out.println("Ativo: " + this.getStatus());
       System.out.println("Saldo: " + this.getSaldo());
   }

}
