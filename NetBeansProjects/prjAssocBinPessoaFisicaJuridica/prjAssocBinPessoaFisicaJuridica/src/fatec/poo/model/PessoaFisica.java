/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author caique
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;

    public PessoaFisica(String c, String n, int anoInsc){
        super(n, anoInsc);
        cpf = c;
    }
    public double calcBonus(int valorAnoAtual){
        if(getTotalCompras()>12000){
            return (valorAnoAtual - getAnoInscricao())*base;
        }
        return 0;
    }
    public String getCpf(){
        return cpf;
    }
    public void setBase(double b){
        base = b;
    }
    public double getBase(){
        return base;
    }
}
