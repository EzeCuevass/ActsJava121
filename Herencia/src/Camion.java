public class Camion extends VehiculoTerrestre {

    private int pesoCarga;

    public Camion(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, int pesoCarga) {
        super(cantidadRuedas, cantidadPuertas, color, cantidadMarchas);
        this.pesoCarga = pesoCarga;
    }

}
