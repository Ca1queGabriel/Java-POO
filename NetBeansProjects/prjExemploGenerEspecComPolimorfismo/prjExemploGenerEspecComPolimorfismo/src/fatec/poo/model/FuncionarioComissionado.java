package fatec.poo.model;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0030482323024
 */
public class FuncionarioComissionado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int r, String n, String dtADM, double taxa) {
        super(r, n, dtADM);
        taxaComissao = taxa;
    }

    public void setSalBase(double s) {
        salBase = s;
    }

    public double getSalBase() {
        return salBase;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void addVendas(double venda) {
        totalVendas += venda;
    }

    public double calcSalBruto() {
        return (salBase + taxaComissao * totalVendas);
    }

    public double calcGratificacao() {
        if (totalVendas < 5000.00) {
            return 0;
        } else if (totalVendas < 10000.00) {
            return calcSalBruto() * 0.03;
        } else {
            return calcSalBruto() * 0.05;
        }
    }

    public double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}
