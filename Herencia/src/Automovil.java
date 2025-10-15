public class Automovil extends VehiculoTerrestre {

    private int cantidadPasajeros;

    public Automovil(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int cantidadPasajeros) {
        super(cantidadRuedas, cantidadPuertas, color, cantidadMarchas);
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
