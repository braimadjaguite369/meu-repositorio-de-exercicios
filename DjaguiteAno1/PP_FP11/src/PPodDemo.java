// 11/05/2026
//Braima Djaguité       ESTG
public class PPodDemo {

    public static void main(String[] arg){
        File[] files = new File[20];
        Ordenacao porNome = new OrdenacaoNomeAscendente();
        Ordenacao porTamanho = new OrdenacaoTamanhoDescendente();
        Ordenacao porDuracao = new OrdenacaoDuracaoAscendente();
        files[0] = new File("Klash", "mp3", 5, 3);
        files[1] = new File("As One", "mp3", 3, 4);
        files[2] = new File("Mbay", "mp3", 4, 5);
        Player player = new Player(porNome);
        try{
        player.addFile(files[0]);
        player.addFile(files[1]);
        player.addFile(files[2]);
        player.sufflePlay();
        player.list();
        } catch (MemoriaCheiaException m){
            System.out.println("Meória está cheia " + m);
        } catch (IllegalArgumentException e){
            System.out.println("Valor fornecido é inválido " + e);
        } catch (ArrayVazioException a){
            System.out.println("A coleção precisa ter elementos " + a);
        } catch (ArrayIndexOutOfBoundsException i){
            System.out.println("Este elemento não existe " + i);
        }
    }
}
