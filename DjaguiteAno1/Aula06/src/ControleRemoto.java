public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(isLigado()){
            System.out.println("------MENU----------");
            System.out.println("Ligado: " + isLigado());
            System.out.println("Volume: " + getVolume());
            System.out.println("Tocando: " + isTocando());
        } else{
            System.out.println("Impossivel, está desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando...");
    }

    @Override
    public void maisVolume() {
         if(isLigado()){
             setVolume(getVolume() + 5);
         } else{
             System.out.println("Esta desligado");
         }
    }

    @Override
    public void menosvolume() {
        if(isLigado()){
            setVolume(getVolume() - 5);
        } else{
            System.out.println("Esta desligado");
        }
    }

    @Override
    public void ligarMudo() {
         if(isLigado() && getVolume() > 0){
             setVolume(0);
         } else{
             System.out.println("Nao esta mudo");
         }
    }

    @Override
    public void desligarMudo() {
         if(isLigado() && getVolume() == 0){
             setVolume(50);
         } else{
             System.out.println("Ja estava mudo");
         }
    }

    @Override
    public void play() {
        if(isLigado()){
            setTocando(true);
        } else{
            System.out.println("Esta desligado");
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()){
            setTocando(false);
        }
    }
}
