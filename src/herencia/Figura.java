package herencia;

public class Figura  {

    private double area;
    private double perimetro;

    public Figura() {
    }

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;

    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcularArea(double base, double altura) {

        double area = base * altura;   
        return area;

    }

    public double calcularPerimetro() {
        return 0;

    }
    
    private void texto (){
        System.out.println("Soy un texto");
    }

}
