package fatec.poo.model;
/**
 *
 * @author Caique Gabriel
 */
public class Retangulo {
    private double Altura;
    private double Base;
    public void setAltura(double a){
        Altura = a;
    }
    public void setBase(double b){
        Base = b;
    }
    public double getAltura(){
        return Altura;
    }
    public double getBase(){
        return Base;
    }
    public double CalcArea(){
        double Area;
        Area = Altura*Base;
        return Area;
    }
    public double CalcPerimetro(){
        return(2*(Base+Altura));
    }
    public double calcDiagonal(){
        return(Math.sqrt((Math.pow(Altura, 2))+Math.pow(Base, 2)));
    }
}