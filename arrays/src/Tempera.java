public class Tempera {
    private Color color;
    private String marca;
    private int cantidad;

    Tempera(Color color, String marca, int cantidad) {
        this.color = color;
        this.marca = marca;
        this.cantidad = cantidad;
    }
    private String mostrar(){
        return "Color: " + this.color + ", Marca: " + this.marca + ", Cantidad: " + this.cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public static String mostrar(Tempera tempera){
        return tempera.mostrar();
    }
    public static boolean sonIguales(Tempera t1, Tempera t2){
        return t1.color == t2.color && t1.marca.equals(t2.marca);
    }
    public static boolean sonDistintos(Tempera t1, Tempera t2){
        return !sonIguales(t1, t2);
    }
    public static Tempera add(Tempera t1, double cantidad) {
        t1.cantidad += cantidad;
        return t1;
    }
}
