public class OrdenacaoDuracaoAscendente implements Ordenacao{
    @Override
    public void ordenar(File[] file, int numArquivos) {
        for(int i = 0; i < numArquivos - 1; i++){
            for(int j = 0; j < numArquivos - 1 - i; j++){
                if(file[j].getDuracao() > file[j+1].getDuracao()){
                    File temp = file[j];
                    file[j] = file[j+1];
                    file[j+1] = temp;
                }
            }
        }

    }
}
