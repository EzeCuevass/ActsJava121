public class Prueba {
    private String fecha;
    private int duracion;
    private int resultado;
    private Nivel nivel;

    Prueba(String fecha, int duracion, int resultado){
        this.fecha = fecha;
        this.duracion = duracion;
        this.resultado = resultado;
        if (resultado >= 8 && duracion <= 90) {
            this.nivel = Nivel.EXCELENTE;
        } else if (resultado > 5 && duracion <= 90) {
            this.nivel = Nivel.ACEPTABLE;
        } else {
            this.nivel = Nivel.DEFICIENTE;
        }
    }
    public String getFecha() {
        return fecha;
    }
    public int getDuracion() {
        return duracion;
    }
    public int getResultado() {
        return resultado;
    }
    public Nivel getNivel() {
        return nivel;
    }

}
