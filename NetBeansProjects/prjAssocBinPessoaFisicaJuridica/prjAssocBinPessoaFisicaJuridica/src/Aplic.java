import fatec.poo.model.*;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author 0030482323024
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double venda;
        String nome, cgc, cpf;
        int anoInscricao, numPedido=0;

        PedidoCompra[] cadPedidos = new PedidoCompra[10];
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Insira o CPF da pessoa física: ");
        cpf = entrada.next();
        System.out.println("Insira o nome da pessoa física: ");
        nome = entrada.next();
        System.out.println("Insira o ano de inscrição da pessoa física: ");
        anoInscricao = entrada.nextInt();
        PessoaFisica pessoaFisica = new PessoaFisica(cpf, nome, anoInscricao);
        System.out.println("Adicione o valor da base da pessoa física: ");
        pessoaFisica.setBase(entrada.nextDouble());


        System.out.println("Insira o CGC da pessoa jurídica: ");
        cgc = entrada.next();
        System.out.println("Insira o nome da pessoa jurídica: ");
        nome = entrada.next();
        System.out.println("Insira o ano de inscrição da pessoa jurídica: ");
        anoInscricao = entrada.nextInt();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(cgc, nome, anoInscricao);
        System.out.println("Insira a taxa de incentivo da pessosa jurídica: ");
        pessoaJuridica.setTaxaIncentivo(entrada.nextDouble());

        //


        do {
            System.out.println("Insira se é uma pessoa física ou jurídica(f pra física e j para jurídica): ");
            switch(entrada.next()){
                case "f":
                    cadPedidos[numPedido] = pessoaFisica.criarPedido(pessoaFisica, numPedido, entrada);
                    numPedido++;
                    break;
                case "j":
                    cadPedidos[numPedido] = pessoaJuridica.criarPedido(pessoaJuridica,numPedido,entrada);
                    numPedido++;
            }   
        } while (numPedido<10);
        
        for(int cont=0;cont<pessoaFisica.getNumPedidos();cont++){
            System.out.print("CPF\tNome");
        }
        
        
    }
}
