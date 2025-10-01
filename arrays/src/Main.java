import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
//        int[] numeros = new int[20];
//        Random rand = new Random();
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = rand.nextInt();
//        }
//        for (int numero : numeros) {
//            System.out.println(numero);
//        }
//        Arrays.sort(numeros);
//        System.out.println("Numeros positivos ordenados:");
//        for (int numero : numeros) {
//            if (numero > 0){
//                System.out.println(numero);
//            }
//        }
//        Arrays.sort(numeros);
//        System.out.println("Numeros negativos ordenados:");
//        for (int numero : numeros) {
//            if (numero < 0) {
//                System.out.println(numero);
//            }
//        }
        Conductor conductor1 = new Conductor("Juan", new ArrayList<>(Arrays.asList(100, 200, 150, 300, 258, 0, 0)));
        Conductor conductor2 = new Conductor("Pedro", new ArrayList<>(Arrays.asList(0, 75, 0, 175, 451, 128, 137)));
        Conductor conductor3 = new Conductor("Maria", new ArrayList<>(Arrays.asList(50, 0, 100, 0, 450, 200, 250)));
        EmpresaTransporte empresa = new EmpresaTransporte();
        empresa.agregarConductor(conductor1);
        empresa.agregarConductor(conductor2);
        empresa.agregarConductor(conductor3);
        ArrayList<Conductor> conductores = empresa.getListaConductores();
        int conductorMasKilometros = 0;
        int conductorMasKilometrosDia3 = 0;
        int conductorMasKilometrosDia5 = 0;
        for (int i = 0 ; i < conductores.size(); i++) {
            Conductor conductor = conductores.get(i);
            ArrayList<Integer> kilometros = conductor.getKilometrosRecorridos();
            int totalKilometros = conductor.getTotalKilometros();
            System.out.println("El conductor " + conductor.getNombre() + " ha recorrido un total de " + totalKilometros + " kilometros.");
            if (totalKilometros > conductores.get(conductorMasKilometros).getTotalKilometros()) {
                conductorMasKilometros = i;
            }
            if (kilometros.get(2) > conductores.get(conductorMasKilometrosDia3).getKilometrosRecorridos().get(2)) {
                conductorMasKilometrosDia3 = i;
            }
            if (kilometros.get(4) > conductores.get(conductorMasKilometrosDia5).getKilometrosRecorridos().get(4)) {
                conductorMasKilometrosDia5 = i;
            }
        }
//        System.out.println("El conductor con mas kilometros recorridos es: " + conductores.get(conductorMasKilometros).getNombre() + " con " + conductores.get(conductorMasKilometros).getTotalKilometros() + " kilometros.");
//        System.out.println("El conductor con mas kilometros recorridos el dia 3 es: " + conductores.get(conductorMasKilometrosDia3).getNombre() + " con " + conductores.get(conductorMasKilometrosDia3).getKilometrosRecorridos().get(2) + " kilometros.");
//        System.out.println("El conductor con mas kilometros recorridos el dia 5 es: " + conductores.get(conductorMasKilometrosDia5).getNombre() + " con " + conductores.get(conductorMasKilometrosDia5).getKilometrosRecorridos().get(4) + " kilometros.");
        Veterinaria vet = new Veterinaria();
        Cliente cliente1 = new Cliente("Calle Falsa 123", "Juan", "Perez", 1115634547);
        cliente1.addMascota(new Mascota("Perro", "Pepe", new Date(2021, 8,25)));
        Cliente cliente2 = new Cliente("Esquiro 247", "Marta", "Ramirez", 1142527478);
        Mascota mascota2 = new Mascota("Gato", "Bola de Nieve", new Date(2022,7,6));
        mascota2.addVacuna("Triple Felina");
        cliente2.addMascota(mascota2);
        Cliente cliente3 = new Cliente("Rawson 2863", "Ezequiel", "Cuevas", 1134856871);
        Mascota mascota3 = new Mascota("Gato", "Yuumi", new Date(2024,3,15));
        Mascota mascota4 = new Mascota("Perro" , "John", new Date(2018,11,30));
        mascota4.addVacuna("Antirrabica");
        cliente3.addMascota(mascota3);
        cliente3.addMascota(mascota4);
        vet.agregarCliente(cliente1);
        vet.agregarCliente(cliente2);
        vet.agregarCliente(cliente3);
        ArrayList<Cliente> clientes = vet.getClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.mostrarCliente());
        }
    }
}