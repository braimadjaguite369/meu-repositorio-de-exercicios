package pp_fp05;

public class Express {
    private static int idGlob = 1;
    protected int id;
    public String tipo;
    protected float montante;
    protected String data;

    public Express(String tipo, float montante, String data){
          this.id = idGlob++;
          this.tipo = tipo;
          this.montante = montante;
          this.data = data;
    }
}
