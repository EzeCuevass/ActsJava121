import java.time.LocalDate;
class Cosa {
    int entero;
    String cadena;
    LocalDate fecha;


    public void establecerValor(int entero){
        this.entero = entero;
    }
    public void establecerValor(String cadena){
        this.cadena = cadena;
    }
    public void establecerValor(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String mostrar() {
        return "Entero: " + entero + " --- Cadena: " + cadena + " --- Fecha: " + fecha;
    }
    public static String mostrar(Cosa cosa) {
        return "Entero: " + cosa.entero + " --- Cadena: " + cosa.cadena + " --- Fecha: " + cosa.fecha;
    }
}
class Tinta {
    private Color color;
    private Tipo tipo;

    public Tinta() {
        this.color = Color.VERDE;
        this.tipo = Tipo.CHINA;
    }

    public Tinta(Color color) {
        this.color = color;
        this.tipo = Tipo.CHINA;
    }

    public Tinta(Tipo tipo) {
        this.color = Color.VERDE;
        this.tipo = tipo;
    }

    public Tinta(Color color, Tipo tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(color).append(" --- Tipo: ").append(tipo);
        return sb.toString();
    }

    public static String mostrar(Tinta tinta) {
        StringBuilder sb = new StringBuilder();
        sb.append("Color: ").append(tinta.color).append(" --- Tipo: ").append(tinta.tipo);
        return sb.toString();
    }
    public boolean sonIgaules(Tinta tinta1, Tinta tinta2){
        return tinta1.color == tinta2.color && tinta1.tipo == tinta2.tipo;
    }
    public boolean sonDistintos(Tinta tinta1, Tinta tinta2){
        return tinta1.color != tinta2.color || tinta1.tipo != tinta2.tipo;
    }
}
class Pluma {
    private String marca;
    private Tinta tinta;
    private int cantidad;

    public Pluma() {
        this.marca = "Sin marca";
        this.tinta = null;
        this.cantidad = 1;
    }
    public Pluma(String marca) {
        this.marca = marca;
        this.tinta = null;
        this.cantidad = 1;
    }
    public Pluma(Tinta tinta) {
        this.marca = "Sin marca";
        this.tinta = tinta;
        this.cantidad = 1;
    }
    public Pluma(String marca, Tinta tinta) {
        this.marca = marca;
        this.tinta = tinta;
        this.cantidad = 1;
    }
    public Pluma(String marca, int cantidad) {
        this.marca = marca;
        this.tinta = null;
        this.cantidad = cantidad;
    }
    public Pluma(Tinta tinta, int cantidad) {
        this.marca = "Sin marca";
        this.tinta = tinta;
        this.cantidad = cantidad;
    }
    public Pluma(String marca, Tinta tinta, int cantidad) {
        this.marca = marca;
        this.tinta = tinta;
        this.cantidad = cantidad;
    }
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca);
        if (tinta != null) {
            sb.append(" --- ").append(tinta.mostrar());
        } else {
            sb.append(" --- Sin tinta");
        }
        sb.append(" --- Cantidad: ").append(cantidad);
        return sb.toString();
    }
    public static boolean sonIgaules(Pluma pluma, Tinta tinta) {
        return pluma.tinta == tinta;
    }
    public static boolean sonDistintos(Pluma pluma, Tinta tinta) {
        return pluma.tinta != tinta;
    }
    public static Pluma add(Pluma pluma, Tinta tinta) {
        if (sonIgaules(pluma, tinta)){
            pluma.cantidad++;
        }
        return pluma;
    }
    public static Pluma remove(Pluma pluma, Tinta tinta) {
        if (sonIgaules(pluma, tinta) && pluma.cantidad > 0){
            pluma.cantidad--;
        }
        return pluma;
    }
}
public class Main {
    public static void main(String[] args) {
//        Qué cosa, la cosa...
//        System.out.println("Hello and welcome!");
//        Cosa cosa1 = new Cosa();
//        cosa1.establecerValor(10);
//        cosa1.establecerValor("Hola");
//        cosa1.establecerValor(LocalDate.of(2023, 12, 9));
//        System.out.println(cosa1.mostrar());
//        Cosa cosa2 = new Cosa();
//        cosa2.establecerValor(20);
//        cosa2.establecerValor("Mundo");
//        cosa2.establecerValor(LocalDate.of(2024, 1, 1));
//        System.out.println(Cosa.mostrar(cosa2));
    }
}