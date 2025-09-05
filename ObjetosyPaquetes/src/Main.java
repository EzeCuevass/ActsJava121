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

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pablo", 1000);
        cuenta1.mostrar();
        cuenta1.ingresar(500);
        cuenta1.mostrar();
        cuenta1.retirar(1000);
        cuenta1.mostrar();
        cuenta1.retirar(600);
        cuenta1.mostrar();
    }
}