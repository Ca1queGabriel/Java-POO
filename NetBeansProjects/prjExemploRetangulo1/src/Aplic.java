
import fatec.poo.model.Retangulo;

/**
 *
 * @author Ruan Bertholino
 */



public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet, objRet2;
        
        objRet = new Retangulo();
        objRet.setAltura(8.0);
        objRet.setBase(5.0);
        System.out.println("Medida da altura do objRet1: "+ objRet.getAltura());
        System.out.println("Medida da base do objRet1: "+ objRet.getBase());
        System.out.println("Area total do objRet1: "+objRet.CalcArea());
        System.out.println("Perimetro do objRet1: "+ objRet.CalcPerimetro());
        System.out.println("Diagonal do objRet1: "+ objRet.calcDiagonal());
        
        objRet2 = new Retangulo();
        objRet2.setAltura(3.0);
        objRet2.setBase(4.0);
        System.out.println("\n\nMedida da altura do objRet2: "+ objRet2.getAltura());
        System.out.println("Medida da base do objRet2: "+ objRet2.getBase());
        System.out.println("Area total do objRet2: "+objRet2.CalcArea());
        System.out.println("Perimetro do objRet2: "+ objRet2.CalcPerimetro());
        System.out.println("Diagonal do objRet2: "+ objRet2.calcDiagonal());
    }
}
