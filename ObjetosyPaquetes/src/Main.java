import java.util.Random;

class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void mostrar() {
        System.out.println("Titular: " + this.getTitular() + ", Cantidad: " + this.getCantidad());
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("Saldo insuficiente, solo pudiste retirar " + this.cantidad);
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
}
class Estudiante{
    private String apellido;
    private String legajo;
    private String nombre;
    private int notaPrimerParcial;
    private int notaSegundoParcial;
    private static Random random;

    static {
        random = new Random();
    }
    public Estudiante(){
        this.apellido = "";
        this.legajo = "";
        this.nombre = "";
        this.notaPrimerParcial = -1;
        this.notaSegundoParcial = -1;
    }
    public Estudiante(String apellido, String legajo, String nombre){
        this.apellido = apellido;
        this.legajo = legajo;
        this.nombre = nombre;
        this.notaPrimerParcial = -1;
        this.notaSegundoParcial = -1;
    }
    public void setNotaPrimerParcial(int nota){
        this.notaPrimerParcial = nota;
    }
    public void setNotaSegundoParcial(int nota){
        this.notaSegundoParcial = nota;
    }
    private float calcularPromedio(){
        return (float) ((this.notaSegundoParcial+this.notaPrimerParcial)/2);
    }
    public double calcularNotaFinal() {
        if (this.notaPrimerParcial >= 4 && this.notaSegundoParcial >= 4) {
            // Genera un número aleatorio entre 6 y 10 (ambos incluidos)
            return 6 + random.nextInt(5); // nextInt(5) genera 0 a 4, así que suma 6 para obtener 6 a 10
        } else {
            // Caso contrario, retorna -1
            return -1;
        }
    }
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(this.nombre)
                .append(", Apellido: ").append(this.apellido)
                .append(", Legajo: ").append(this.legajo)
                .append(", Nota 1er Parcial: ").append(this.notaPrimerParcial)
                .append(", Nota 2do Parcial: ").append(this.notaSegundoParcial)
                .append(", Promedio: ").append(this.calcularPromedio());

        double notaFinal = this.calcularNotaFinal();
        if (notaFinal != -1) {
            sb.append(", Nota Final: ").append(notaFinal);
        } else {
            sb.append(", Nota Final: Alumno desaprobado");
        }

        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
//        Creo que necesito un préstamo
//        Cuenta cuenta1 = new Cuenta("Pablo", 1000);
//        cuenta1.mostrar();
//        cuenta1.ingresar(500);
//        cuenta1.mostrar();
//        cuenta1.retirar(1000);
//        cuenta1.mostrar();
//        cuenta1.retirar(600);
//        cuenta1.mostrar();
    }
}