
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int r, String nome, String dtAdm, double valHor) {
        super(r, nome, dtAdm);
        valHorTrab = valHor;
    }

    public void setQtdeHorTrab(int qht) {
        qtdeHorTrab = qht;
    }

    public double calcSalBruto() {
        return (valHorTrab * qtdeHorTrab);
    }

    public double calcGratificacao() {
        return calcSalBruto() * 0.075;
    }

    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
        // return calcSalBruto() + calcGratificacao() - calcDesconto();
    }
}
