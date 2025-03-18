
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author 0030482323024
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Circulo objCirculo = new Circulo();
        System.out.println("Insira o raio do circulo: ");
        double medRaio = Entrada.nextDouble();
        objCirculo.setRaio(medRaio);
        
        System.out.println("A area do circulo é de: "+ objCirculo.calcArea());
        System.out.println("O perimetro do circulo é de: "+ objCirculo.calcPerimetro());
        System.out.println("O diametro do circulo é de: "+ objCirculo.calcDiametro());
        
    }
    
}
