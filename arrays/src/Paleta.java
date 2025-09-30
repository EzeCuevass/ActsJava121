import java.util.ArrayList;
public class Paleta {
    private ArrayList<Tempera> colores;
    private int cantidadMaximaColores;

    public Paleta(int cantidadMaximaColores) {
        this.cantidadMaximaColores = cantidadMaximaColores;
        this.colores = new ArrayList<>();
    }
    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cantidad maxima de colores: ").append(this.cantidadMaximaColores).append("\n");
        sb.append("Colores en la paleta:\n");
        for (Tempera tempera : this.colores) {
            sb.append(Tempera.mostrar(tempera)).append("\n");
        }
        return sb.toString();
    }
    private int obtenerIndice(){
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i) == null) {
                return i;
            }
        }
        return -1;
    }
    private int obtenerIndice(Tempera t1){
        for (int i = 0; i < colores.size(); i++) {
            if (Tempera.sonIguales(colores.get(i), t1)) {
                return i;
            }
        }
        return -1;
    }
    public static boolean sonIguales(Paleta p1, Tempera t1){
        for (Tempera tempera : p1.colores) {
            if (Tempera.sonIguales(tempera, t1)) {
                return true;
            }
        }
        return false;
    }
    public static boolean sonDistintos(Paleta p1, Tempera t1) {
        return !sonIguales(p1, t1);
    }
    public static Paleta add(Paleta p1, Tempera t1) {
        int indice = p1.obtenerIndice(t1);
        if (indice != -1) {
            Tempera temperaExistente = p1.colores.get(indice);
            Tempera.add(temperaExistente, t1.getCantidad());
        } else {
            if (p1.colores.size() < p1.cantidadMaximaColores) {
                p1.colores.add(t1);
            } else {
                System.out.println("No se puede agregar mas colores a la paleta.");
            }
        }
        return p1;
    }
}
