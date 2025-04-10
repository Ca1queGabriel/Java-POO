/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.model;
import java.util.Scanner;
/**
 *
 * @author caique
 */
abstract public class Pessoa {

    private String nome;
    private int anoInscricao, numPedidos;
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
    public int getNumPedidos(){
        return numPedidos;
    }
   
    //fiz dessa forma pq é mais fácil, na minha cabeça
    public PedidoCompra criarPedido(Pessoa pessoa, int numero, Scanner entrada){
        PedidoCompra novoPedido = new PedidoCompra(numero, pessoa);
        System.out.println("Insira a data do pedido: ");
        novoPedido.setDataPedido(entrada.next());
        System.out.println("Insira o valor da compra");
        novoPedido.setValor(entrada.nextDouble());
        pessoa.addCompras(novoPedido.getValor());
        numPedidos++;
        return novoPedido;
    }
}
