package herencia;

public class Circulo extends Figura implements Mensajes, MensajesDos{
    
    private double radio;
    private double diametro;

    public Circulo() {
        super();
    }
    
    
    
    
    public static void main(String[] args) {
        
        Circulo cir = new Circulo();       
        
        cir.setArea(10.6);
        cir.setPerimetro(40.5);     
        cir.setRadio(4.6);
        cir.setDiametro(5.6);
        
       double areaCir1 = cir.calcularArea(cir.getDiametro(), cir.getRadio());
 
        System.out.println(" Area Circulo 1 " + areaCir1);
        
        Circulo cir2 = new Circulo();
        cir2.setArea(23.5);
        cir2.setPerimetro(34.6);
        
        System.out.println(" Area obj1  = " + cir.getArea() + " \n Perimetro obj1  "+ cir.getPerimetro());
       
   
        double otraVariable = cir2.getArea();
        
        otraVariable = otraVariable + 10;
        
        System.out.println(" Area obj2  = " + otraVariable);
        System.out.println(" Perimetro obj2  = " + cir2.getPerimetro());
        
        
            Figura objFig = new Circulo();
            objFig.getArea();
            
            Figura objFig2 = new Figura(10.3, 20.3);
            
            
            
            Figura objFig3 = new Figura();
            objFig3.setArea(10.3);
            objFig3.setPerimetro(20.3);
        
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    } 

    @Override
    public String saludo() {
        String hola = "Esto es un saludo desde Circulo";
        return hola;
    }

    @Override
    public double area(double base, double altura) {
        return altura * base;
    }

    @Override
    public String saludoInterDos(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
