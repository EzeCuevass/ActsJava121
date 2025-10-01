import java.util.ArrayList;
import java.util.Date;
public class Mascota {
    private String especie;
    private String nombre;
    private Date fechaNacimiento;
    private ArrayList<String> historialVacunas;

    public Mascota(String especie, String nombre, Date fechaNacimiento) {
        this.especie = especie;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.historialVacunas = new ArrayList<>();
    }
    public String getEspecie() {
        return especie;
    }
    public String getNombre() {
        return nombre;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public ArrayList<String> getHistorialVacunas() {
        return historialVacunas;
    }
    public ArrayList<String> addVacuna(String vacuna) {
        this.historialVacunas.add(vacuna);
        return this.historialVacunas;
    }
    public String mostrarMascota() {
        return "Mascota{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", historialVacunas=" + historialVacunas +
                '}';
    }
}
