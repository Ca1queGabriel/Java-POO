
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class Projeto {
    
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private int numFunc;
    private Funcionario[] funcionarios;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void listarFuncionarios(){
        System.out.println("___________________________________________");
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data Início: " + dtInicio);
        System.out.println("Data Término: " + dtTermino);
        System.out.println("Qtde. de Funcionários: " + numFunc);
        System.out.println("\n\nRegistro\tNome\t\tCargo\t\tDepartamento");
        for(int cont=0; cont<numFunc;cont++){
        System.out.print(funcionarios[cont].getRegistro());
        System.out.print("\t\t" + funcionarios[cont].getNome());
        System.out.print("\t" + funcionarios[cont].getCargo());
        System.out.println("\t" + funcionarios[cont].getDepartamento().getNome());
        }

    }
    
    public void addFuncionario(Funcionario funcionario){
    this.funcionarios[numFunc] = funcionario;
    numFunc++;
    }
    
    
    
}
