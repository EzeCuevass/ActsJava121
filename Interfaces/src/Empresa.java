import java.util.ArrayList;
public class Empresa {
    private String nombre;
    private ArrayList<Cohete> cohetes;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.cohetes = new ArrayList<Cohete>();
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Cohete> getCohetes() {
        return cohetes;
    }
    public void addCohete(Cohete cohete) {
        this.cohetes.add(cohete);
        System.out.println("Cohete " + cohete.getNombre() + " agregado a la empresa " + this.nombre);
    }
    public int cantListosParaLanzar(){
        int listos = 0;
        for (Cohete cohete : cohetes) {
            int aprobadas = 0;
            ArrayList<Prueba> pruebas = cohete.getPruebas();
            if (!pruebas.isEmpty()) {
                for (Prueba prueba : pruebas) {
                    if (prueba.getNivel() == Nivel.EXCELENTE || prueba.getNivel() == Nivel.ACEPTABLE) {
                        aprobadas++;
                    }
                }
            }
            if (aprobadas == pruebas.size() && !pruebas.isEmpty()) {
                listos++;
            }
        }
        return listos;
    }

}
