package geometria;

public class Rectangulo {
    private float area;
    private float perimetro;
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    public Rectangulo(Punto vertice1, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice3 = vertice3;
        this.vertice2 = new Punto(vertice3.getX(),vertice1.getY());
        this.vertice4 = new Punto(vertice1.getX(),vertice3.getY());
    }
    public void calcularArea() {
        float base = Math.abs(vertice3.getX() - vertice1.getX());
        float altura = Math.abs(vertice3.getY() - vertice1.getY());
        this.area = base * altura;
    }
    public float getArea(){
        calcularArea();
        return this.area;
    }
    public void calcularPerimetro() {
        float base = Math.abs(vertice3.getX() - vertice1.getX());
        float altura = Math.abs(vertice3.getY() - vertice1.getY());
        this.perimetro = 2 * (base + altura);
    }
    public float getPerimetro() {
        calcularPerimetro();
        return this.perimetro;
    }
}
