package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class Aluno {
    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;
    
    public void setRA(int ra){
        RA = ra;
    }
    public void setPrv1(double pr1){
        NtPrv1 = pr1;
    }
    public void setPrv2(double pr2){
        NtPrv2 = pr2;
    }
    public void setTrab1(double trab1){
        NtTrab1 = trab1;
    }
    public void setTrab2(double trab2){
        NtTrab2 = trab2;
    }
    public int getRA(){
        return RA;
    }
    public double getPrv1(){
        return NtPrv1;
    }
    public double getPrv2(){
        return NtPrv2;
    }
    public double getTrab1(){
        return NtTrab1;
    }
    public double getTrab2(){
        return NtTrab2;
    }
    public double calcMediaProva(){
        return (0.75*(NtPrv1+2*NtPrv2)/3);    
    }
    public double calcMediaTrab(){
        return (0.25*(NtTrab1+NtTrab2)/2);
    }
    public double calcMediaFinal(){
        return calcMediaTrab()+calcMediaProva();
    }
    public boolean isAprovado(){
        return calcMediaTrab() >= 6;
        }
    }

