
/**
 *
 * @author Caique
 */

import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista objFuncHor = new FuncionarioHorista(1010, "Caique Gabriel Gomes Lima", "44/07/2006", 15.80);
        objFuncHor.setQtdeHorTrab(90);
        objFuncHor.setCargo("Programador");
        System.out.println("Registro do horista: " + objFuncHor.getRegistro());
        System.out.println("Nome do horista: " + objFuncHor.getNome());
        System.out.println("Data de admissão do horista: " + objFuncHor.getdtAdmissao());
        System.out.println("Cargo do horista " + objFuncHor.getCargo());
        System.out.println("Salário bruto horista: " + objFuncHor.calcSalBruto());
        System.out.println("Desconto horista: " + objFuncHor.calcDesconto());
        System.out.println("Salário Líquido horista: " + objFuncHor.calcSalLiquido() + "\n\n");

        FuncionarioMensalista objFuncMen = new FuncionarioMensalista(1011, "Julia Andrade de Gomes", "04/07/2006", 19.80);
        objFuncMen.setNumMin(90);
        objFuncMen.setCargo("Engenheira");
        System.out.println("Registro do mensalista: " + objFuncMen.getRegistro());
        System.out.println("Nome do mensalista: " + objFuncMen.getNome());
        System.out.println("Data de admissão do mensalista: " + objFuncMen.getdtAdmissao());
        System.out.println("Cargo do mensalista: " + objFuncMen.getCargo());
        System.out.println("Salário bruto mensalista: " + objFuncMen.calcSalBruto());
        System.out.println("Desconto mensalista: " + objFuncMen.calcDesconto());
        System.out.println("Salário Líquido mensalista:  " + objFuncMen.calcSalLiquido() + "\n\n");

        FuncionarioComissionado objFuncCom = new FuncionarioComissionado(1012, "Guilherme Higino", "07/01/2005", 0.3);
        objFuncCom.setSalBase(3000);
        objFuncCom.setCargo("Programador da B2BIT");
        objFuncCom.addVendas(25000);
        System.out.println("Registro do comissionado: " + objFuncCom.getRegistro());
        System.out.println("Nome do comissionado: " + objFuncCom.getNome());
        System.out.println("Data de admissão do comissionado: " + objFuncCom.getdtAdmissao());
        System.out.println("Cargo do comissionado: " + objFuncCom.getCargo());
        System.out.println("Salário base do comissionado: " + objFuncCom.getSalBase());
        System.out.println("Total de vendas do comissionado: " + objFuncCom.getTotalVendas());
        System.out.println("Salário bruto do comissionado" + objFuncCom.calcSalBruto());
        System.out.println("Gratificação do comissionado: " + objFuncCom.calcGratificacao());
        System.out.println("Salário líquido do comissionado: " + objFuncCom.calcSalLiquido());
    }

}
