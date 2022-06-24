package herencia;


public class Cuadrado extends Figura implements Mensajes{

    @Override
    public String saludo() {
       return "Hola desde el cuadrado";
    }

    @Override
    public double area(double base, double altura) {
        double areaCuadrado = base * altura;
        
        return  areaCuadrado;
    }
    
}
