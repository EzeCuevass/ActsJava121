import java.util.ArrayList;
public class Equipo {
    private int cantidadDeJugadores;
    private String nombre;
    private ArrayList<Jugador> jugadores;

    private Equipo(){
        this.cantidadDeJugadores = 0;
        this.nombre = "";
        this.jugadores = new ArrayList<>();
    }
    public Equipo(int cantidadDeJugadores, String nombre) {
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public static Equipo add(Equipo e, Jugador j){
        if (e.jugadores.size() < e.cantidadDeJugadores && !e.jugadores.contains(j)) {
            e.jugadores.add(j);
            return e;
        }
        return e;
    }
}
