
import fatec.poo.model.*;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        Departamento dep1 = new Departamento("CMP", "Compras");
        Departamento dep2 = new Departamento("VD", "Vendas");
        Projeto proj1 = new Projeto(114, "Projeto de compras");
        Projeto proj2 = new Projeto(115, "Projeto de Vendas");
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        dep2.addFuncionario(funcCom);
        proj1.addFuncionario(funcHor);
        proj1.addFuncionario(funcMen);
        proj2.addFuncionario(funcCom);
        proj1.setDtInicio("14/08/2004");
        proj1.setDtTermino("14/08/2025");
        proj2.setDtInicio("04/07/2006");
        proj2.setDtTermino("04/07/2025");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Vendedor");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        funcHor.setProjeto(proj1);
        System.out.println("O funcionaro horista "+funcHor.getNome()+ " trabalha no setor de "+ funcHor.getDepartamento().getNome() +"\ne está alocado no "+ funcHor.getProjeto().getDescricao());
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        funcMen.setProjeto(proj1);
        System.out.println("\nO Funcionario Mensalista " +funcMen.getNome()+" trabalha no setor de "+ funcMen.getDepartamento().getNome()+"\ne está alocado no "+ funcMen.getProjeto().getDescricao());
    
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        funcCom.setProjeto(proj2);
        System.out.println("\nO funcionario comissionado "+funcCom.getNome()+" trabalha no setor de "+ funcCom.getDepartamento().getNome()+"\ne está alocado no "+ funcCom.getProjeto().getDescricao());

        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
    
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep1.listarFuncionarios();
        dep2.listarFuncionarios();
        proj1.listarFuncionarios();
        proj2.listarFuncionarios();
    }    
}
