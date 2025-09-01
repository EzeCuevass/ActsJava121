import java.util.Scanner;
import java.lang.Math;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private void min_max(){
        int min = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<5; i++) {
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();
            if (i==0) {
                min = num;
                max = num;
            } else {
                if (num > max) {
                    max = num;
                } else if (num < min){
                    min = num;
                }
            }
        }
        System.out.println("El numero minimo es: " + min);
        System.out.println("El numero maximo es: " + max);
    }
    private void potencias(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println("La potencia cuadrada del numero "+num+" es : " + Math.pow(num, 2));
        System.out.println("La potencia cubica del numero "+num+" es : " + Math.pow(num, 3));
    }
    private void primos(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i=0; i <= num; i++) {
            int contador = 0;
            for (int j=1; j<=i; j++) {
                if ( i % j == 0 ) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("El numero "+i+" es primo");
            } else {
                System.out.println("El numero "+i+" no es primo");
            }
        }
    }
    /*private void perfectos() {
        int contador_perfectos = 0;
        for (int i=1; contador_perfectos < 4; i++) {

        }
    }*/

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola mundo!");
        Main m = new Main();
//        m.min_max();
//        m.potencias();
//        m.primos();
    }
}