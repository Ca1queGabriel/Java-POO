import fatec.poo.model.Retangulo;
import java.util.Scanner;


/**
 *
 * @author Caique Gabriel Gomes Lima
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        Retangulo objRet = new Retangulo();
        double medAlt, medBase;
           
        System.out.print("Digite a altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a base: ");
        medBase = entrada.nextDouble();
      
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        System.out.println("Medida da altura do objRet: "+ objRet.getAltura());
        System.out.println("Medida da base do objRet: "+ objRet.getBase());
        System.out.println("Area total do objRet: "+objRet.CalcArea());
        System.out.println("Perimetro do objRet: "+ objRet.CalcPerimetro());
        System.out.println("Diagonal do objRet: "+ objRet.calcDiagonal());

    }
    
}
