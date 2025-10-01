import java.util.ArrayList;
public class Cliente {
    private String domicilio;
    private String nombre;
    private String apellido;
    private int telefono;
    private ArrayList<Mascota> mascotas;

    public Cliente(String domicilio, String nombre, String apellido, int telefono) {
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }
    public String mostrarCliente() {
        return "Cliente{" +
                "domicilio='" + domicilio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", mascotas=" + mascotas +
                '}';
    }
    public String getDomicilio() {
        return domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getTelefono() {
        return telefono;
    }
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
}
