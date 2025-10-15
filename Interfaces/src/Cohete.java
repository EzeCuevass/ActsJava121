import java.util.ArrayList;
public class Cohete {
    private String id;
    private String nombre;
    private ArrayList<Prueba> pruebas;

    Cohete(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.pruebas = new ArrayList<Prueba>();
    }
    public String getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }
    public void addPrueba(Prueba prueba) {
        this.pruebas.add(prueba);
    }
}
