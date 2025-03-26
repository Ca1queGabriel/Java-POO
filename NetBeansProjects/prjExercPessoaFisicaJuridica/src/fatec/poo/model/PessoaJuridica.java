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
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;

    PessoaJuridica(String cg, String n, int anoInsc) {
        super(n, anoInsc);
        cgc = cg;
    }

    public void setTaxaIncentivo(double taxa) {
        taxaIncentivo = taxa;
    }

    public double calcBonus(int valAnoAtual) {
        return (taxaIncentivo * getTotalCompras()) * (valAnoAtual - getAnoInscricao());
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

}
