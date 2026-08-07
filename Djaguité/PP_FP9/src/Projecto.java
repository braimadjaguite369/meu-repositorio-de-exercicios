public class Projecto {
    private static int proxId = 1;
    private int id;
    private String name;
    private int contador;

    public Projecto(String name) {
        this.id = proxId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getProxId() {
        return proxId;
    }

    public static void setProxId(int proxId) {
        Projecto.proxId = proxId;
    }
}
