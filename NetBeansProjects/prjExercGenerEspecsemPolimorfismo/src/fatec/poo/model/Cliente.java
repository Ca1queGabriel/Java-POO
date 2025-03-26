
package fatec.poo.model;

/**
 *
 * @author caique
 */
public class Cliente extends Pessoa{
    private String cpf;
    private double peso, altura;
    public Cliente (String c, double p, double a, String n, String t){
        super(n, t);
        cpf = c;
        peso = p;
        altura = a;
    }
    public void setPeso(double p){
        peso = p;
    }
    public void setAltura(double a){
        altura = a;
    }
    public String getCpf(){
        return cpf;
    }
    public double getPeso(){
        return peso;
    }
    public double getAltura(){
        return altura;
    }
}
