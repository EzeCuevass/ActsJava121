public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Empresa empresa = new Empresa("SpaceX");
        Cohete cohete1 = new Cohete("C1", "Falcon 9");
        Cohete cohete2 = new Cohete("C2", "Starship");
        Cohete cohete3 = new Cohete("C3", "Electron");
        Prueba prueba1 = new Prueba("2023-01-01", 85, 9);
        Prueba prueba2 = new Prueba("2023-02-01", 80, 7);
        Prueba prueba3 = new Prueba("2023-03-01", 80, 6);
        Prueba prueba4 = new Prueba("2023-04-01", 70, 4);
        Prueba prueba5 = new Prueba("2023-05-01", 60, 8);
        Prueba prueba6 = new Prueba("2023-06-01", 100, 5);

        cohete1.addPrueba(prueba1);
        cohete1.addPrueba(prueba2);
        cohete2.addPrueba(prueba3);
        cohete2.addPrueba(prueba4);
        cohete2.addPrueba(prueba5);
        cohete2.addPrueba(prueba6);
        cohete3.addPrueba(prueba1);
        cohete3.addPrueba(prueba5);

        empresa.addCohete(cohete1);
        empresa.addCohete(cohete2);
        empresa.addCohete(cohete3);

        System.out.println("Cantidad de cohetes listos para lanzar: " + empresa.cantListosParaLanzar());
    }

}
