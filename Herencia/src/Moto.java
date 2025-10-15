public class Moto extends VehiculoTerrestre {
    private short cilindrada;

    public Moto(short cantidadRuedas, short cantidadPuertas, Colores color, short cantidadMarchas, short cilindrada) {
        super(cantidadRuedas, cantidadPuertas, color, cantidadMarchas);
        this.cilindrada = cilindrada;
    }
}
