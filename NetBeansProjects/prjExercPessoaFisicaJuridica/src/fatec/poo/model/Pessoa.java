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
abstract public class Pessoa {

    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String n, int anoInsc) {
        nome = n;
        anoInscricao = anoInsc;
    }

    public abstract double calcBonus(int anoAt);

    public void addCompras(double valCompra) {
        totalCompras += valCompra;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

}
