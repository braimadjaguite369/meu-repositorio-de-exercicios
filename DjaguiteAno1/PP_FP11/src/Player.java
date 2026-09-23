import javax.swing.plaf.PanelUI;

public class Player implements IPpod {
    private static int globalFailure = 0;
    private static final String ERRO_ARG_NULL = "FICHEIRO NULL!!!";
    private static final String ERRO_MAX_FICH = "O MÁXIMO DE FICHEIRO ATINGIDO!";
    private static final String ERRO_INDICE = "ÍNDICE INVÁLIDO!";
    private static final String ERRO_EXTENCAO = "EXTENSÃO INCOMPATÍVEL!";
    public static final int TAMMAXIMO = 20;
    public static final int ESPACOMEMORIA = 102400;
    private int numFile;
    private double espacoOcupado;
    private int indiceAtual;
    File[] files;
    private Ordenacao ordenacao;


    public Player(Ordenacao ordenacao) {
        this.files = new File[TAMMAXIMO];
        this.ordenacao = ordenacao;
        this.numFile = 0;
        this.espacoOcupado = 0;
        this.indiceAtual = -1;
    }

    @Override
    public void addFile(File file) throws MemoriaCheiaException {
        try {
            if(file == null){
                throw new IllegalArgumentException(ERRO_ARG_NULL);
            }
            if(this.numFile == TAMMAXIMO){
                throw new ArrayIndexOutOfBoundsException(ERRO_MAX_FICH);
            }
            if(file.getDuracao() == 0){
                throw new DuracaoException(DuracaoException.ERRO_DURACAO);
            }
            verifySpace(file.getTamanho());

            this.files[this.numFile] = file;
            this.numFile++;
            this.espacoOcupado += file.getTamanho();
        } catch (Exception e){
            globalFailure++;
            throw e;
        }
    }

    @Override
    public void deleteFile(int index) {
         if(index < 0 || index >= this.numFile){
             throw new IllegalArgumentException(ERRO_INDICE);
         }
         if(this.numFile == 0){
           throw new ArrayVazioException(ArrayVazioException.ERROARRAYVAZIO);
         }
        this.espacoOcupado -= this.files[index].getTamanho();
        for(int i = index; i < this.numFile - 1; i++){
            this.files[i] = this.files[i+1];
        }
        this.files[this.numFile -1] = null;
        this.numFile--;
    }

    @Override
    public void playTrack(int index) {
        if(index < 0 || index >= this.numFile){
            throw new IllegalArgumentException(ERRO_INDICE);
        }
        if(!this.files[index].getExtensao().equals("mp3")){
            throw new IllegalArgumentException(ERRO_EXTENCAO);
        }
        if(this.files[index].getDuracao() == 0){
            throw new DuracaoException(DuracaoException.ERRO_DURACAO);
        }
        System.out.println("Nome do ficheiro: " + this.files[index].getNome());
        System.out.println("Duração: " + this.files[index].getDuracao());
    }

    @Override
    public void nextTrack() {
        int busca = this.indiceAtual + 1;
        while (busca < this.numFile){
            if(this.files[busca].getExtensao().equals("mp3")){
               this.indiceAtual = busca;
               playTrack(this.indiceAtual);
               return;
            }
            busca++;
        }
        System.out.println("Não foram encontrados mais ficheiros mp3.");

    }

    @Override
    public void previousTrack(){

        int busca = this.indiceAtual - 1;
        while (busca >= 0){
            if(this.files[busca].getExtensao().equals("mp3")){
                this.indiceAtual = busca;
                playTrack(this.indiceAtual);
                return;
            }
            busca--;
        }
        System.out.println("Não foram encontrados mais ficheiros mp3.");
    }
    public void verifySpace(double tamanho) throws MemoriaCheiaException{
        if((this.espacoOcupado + tamanho) > ESPACOMEMORIA){
            throw new MemoriaCheiaException(MemoriaCheiaException.MEMORIACHEIA);
        }
    }
    public void sufflePlay(){
         this.ordenacao.ordenar(this.files, this.numFile);
         for(int i = 0; i < this.numFile; i++){
             if(this.files[i].getExtensao().equals("mp3")){
                 this.indiceAtual = i;
                 playTrack(i);
                 return;
             }
         }
    }
    public void list(){
        for(int i = 0; i < this.numFile; i++){
            if(this.files[i].getExtensao().equals("mp3")){
                System.out.println("Nome: " + this.files[i].getNome());
            }
        }
    }
    public static int  getGlobalAddFileFailures(){
         return globalFailure;
    }

}
