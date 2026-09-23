import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    Random random = new Random();
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l1.getCategoria()) && l1 != l2){
              this.setAprovado(true);
              this.setDesafiado(l1);
              this.setDesafiante(l2);
              System.out.println("Luta marcada entre" + l1.getNome() + "e" + l2.getNome());

        } else{
             System.out.println("A luta nao pode ser marcada");
             this.setAprovado(false);
             this.setDesafiado(null);
             this.setDesafiante(null);
        }

    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("# DESAFIADO #");
            this.desafiado.apresentar();
            System.out.println("# DESAFIANTE #");
            this.desafiante.apresentar();
            int valor = random.nextInt(3);
            switch(valor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do lutador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do lutador " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

            }
        } else{
            System.out.println("A luta nao pode ser5 marcada");
        }

    }
}
