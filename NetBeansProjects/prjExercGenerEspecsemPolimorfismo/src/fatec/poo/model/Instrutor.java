
package fatec.poo.model;

/**
 *
 * @author caique
 */
public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String a, String n, String t){
        super(n, t);
        identificacao = i;
        areaAtuacao = a;
    }
    public void setAreaAtuacao(String a){
        areaAtuacao = a;
    }
    public int getIdentificacao(){
        return identificacao;
    }
    public String getAreaAtuacao(){
        return areaAtuacao;
    }
    
}
