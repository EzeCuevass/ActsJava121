
public class Jugador {
    private int dni;
    private String nombre;
    private int partidosJugados;
    private int totalGoles;
    private double promedioGoles;

    private Jugador(){
        this.dni = 0;
        this.nombre = "";
        this.partidosJugados = 0;
        this.totalGoles = 0;
        this.promedioGoles = 0.0;
    }
    public Jugador(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        this.partidosJugados = 0;
        this.totalGoles = 0;
        this.promedioGoles = 0.0;
    }
    public Jugador(int dni, String nombre, int partidosJugados, int totalGoles){
        this.dni = dni;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.totalGoles = totalGoles;
        this.promedioGoles = getPromedioGoles();
    }
    public double getPromedioGoles() {
        if (this.partidosJugados > 0) {
            this.promedioGoles = (double) this.totalGoles / this.partidosJugados;
        } else {
            this.promedioGoles = 0.0;
        }
        return this.promedioGoles;
    }
    public String mostrarDatos(){
        return "Jugador{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", partidosJugados=" + partidosJugados +
                ", totalGoles=" + totalGoles +
                ", promedioGoles=" + promedioGoles +
                '}';
    }
    public boolean sonIguales(Jugador j1, Jugador j2){
        return j1.dni == j2.dni;
    }
    public boolean sonDistintos(Jugador j1, Jugador j2){
        return j1.dni != j2.dni;
    }

}
