package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class Circulo {
    private double raio;
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return raio;
    }
    public double calcArea(){
        return (Math.PI * Math.pow(raio,2));
    }
    public double calcPerimetro(){
        return (raio*2*Math.PI);
    }
    public double calcDiametro(){
        return (raio*2);
    }
}
