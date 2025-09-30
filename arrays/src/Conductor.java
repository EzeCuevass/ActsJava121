import java.util.ArrayList;
public class Conductor {
    private String nombre;
    private ArrayList<Integer> kilometrosRecorridos;

    public Conductor(String nombre, ArrayList<Integer> kilometrosRecorridos) {
        this.nombre = nombre;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Integer> getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public int getTotalKilometros() {
        int total = 0;
        for (int km : kilometrosRecorridos) {
            total += km;
        }
        return total;
    }
}
