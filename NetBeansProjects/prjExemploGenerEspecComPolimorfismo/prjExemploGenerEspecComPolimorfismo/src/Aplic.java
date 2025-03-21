/**
 *
 * @author Caique
 */

import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista objFuncHor = new FuncionarioHorista(1010,"Caique Gabriel","44/07/2006",15.80);
        objFuncHor.setQtdeHorTrab(90);
        objFuncHor.setCargo("Programador");
        System.out.println("Registro do horista: " + objFuncHor.getRegistro());
        System.out.println("Nome do horista: " + objFuncHor.getNome());
        System.out.println("Data de admissão do horista: " + objFuncHor.getdtAdmissao());
        System.out.println("Cargo do horista " + objFuncHor.getCargo());
        System.out.println("Salário bruto horista: "+ objFuncHor.calcSalBruto());
        System.out.println("Desconto horista: "+ objFuncHor.calcDesconto());
        System.out.println("Salário Líquido horista: "+ objFuncHor.calcSalLiquido());
        
        
        FuncionarioMensalista objFuncMen = new FuncionarioMensalista (1010,"Caique Gabriel","04/07/2006",15.80);
        objFuncMen.setNumMin(90);
        objFuncMen.setCargo("Cargueiro");
        System.out.println("\n\nRegistro do mensalista: " + objFuncMen.getRegistro());
        System.out.println("Nome do mensalista: " + objFuncMen.getNome());
        System.out.println("Data de admissão do mensalista: " + objFuncMen.getdtAdmissao());
        System.out.println("Cargo do mensalista: " + objFuncMen.getCargo());
        System.out.println("Salário bruto mensalista: "+ objFuncMen.calcSalBruto());
        System.out.println("Desconto mensalista: "+ objFuncMen.calcDesconto());
        System.out.println("Salário Líquido mensalista:  "+ objFuncMen.calcSalLiquido());
    }
    
}
