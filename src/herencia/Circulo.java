package herencia;

public class Circulo extends Figura implements Mensajes{
    
    private double base;
    private double altura;
    
    
    public static void main(String[] args) {
        
        Circulo cir = new Circulo();
        cir.setArea(10.6);
        cir.setPerimetro(40.5);
        
        cir.setBase(4.6);
        cir.setAltura(5.6);
        
       double areaCir1 = cir.calcularArea(cir.getBase(), cir.getAltura());
        
        System.out.println(" " + cir.saludo());
       
        System.out.println(" Area Circulo 1 " + areaCir1);
        
        Circulo cir2 = new Circulo();
        cir2.setArea(23.5);
        cir2.setPerimetro(34.6);
        
        System.out.println(" Area obj1  = " + cir.getArea() + " \n Perimetro obj1  "+ cir.getPerimetro());
       
   
        double otraVariable = cir2.getArea();
        
        otraVariable = otraVariable + 10;
        
        System.out.println(" Area obj2  = " + otraVariable);
        System.out.println(" Perimetro obj2  = " + cir2.getPerimetro());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String saludo() {
       return "Hola mundo";
    }

    @Override
    public double area(double base, double altura) {
       double areaCirculo = base*altura * Math.PI * 2;
       
       return areaCirculo;
    }


    
}
