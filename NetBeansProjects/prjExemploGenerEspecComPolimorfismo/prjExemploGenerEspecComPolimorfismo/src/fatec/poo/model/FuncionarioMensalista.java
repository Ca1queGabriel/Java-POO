
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class FuncionarioMensalista extends Funcionario {
    private double valSalMin;
    private double numSalMin;
    
   public FuncionarioMensalista(int r, String n, String dtAdm, double v){
       super(r, n, dtAdm);
       valSalMin = v;
   }
   public void setNumMin(double n){
       numSalMin = n;
   }
   public double calcSalBruto(){
       return valSalMin * numSalMin;
   }
}
