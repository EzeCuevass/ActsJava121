import java.util.Random;
import java.util.Scanner;
class Adivinadora {
    private int numeroSecreto;
    private int intentos;
    Random random = new Random();
    public Adivinadora() {
        this.numeroSecreto = random.nextInt(100) + 1;
        this.intentos = 0;
    }
    public String adivinar(int numero) {
        if (numero == this.numeroSecreto){
            intentos += 1;
            return String.format("Ganaste! El numero %d lo adivinaste en %d intentos", this.numeroSecreto, this.intentos);
        } else if ( numero > this.numeroSecreto){
            intentos += 1;
            return "El numero que ingresaste es mayor al numero secreto";
        } else if ( numero < this.numeroSecreto){
            intentos += 1;
            return "El numero que ingresaste es menor al numero secreto";
        } else {
            intentos += 1;
            return "Numero invalido, intenta otra vez.";
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivinadora de numeros");
        Adivinadora adivinadora1 = new Adivinadora();
        do{
            System.out.println("Ingresa un numero: ");
            int numeroescaneado = sc.nextInt();
            System.out.println(adivinadora1.adivinar(numeroescaneado));
        } while (true);
    }
}