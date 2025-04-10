
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class PedidoCompra {
    private int numero;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;

    public PedidoCompra(int numero, Pessoa pessoa){
        this.numero = numero;
        this.pessoa = pessoa;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void addPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    
}
