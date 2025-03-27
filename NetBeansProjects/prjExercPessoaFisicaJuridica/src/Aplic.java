
/**
 *
 *
 * @author caique
 */
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.time.LocalDate;
import java.util.Scanner;

public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double venda;
        String nome, cgc, cpf;
        int anoInscricao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o CPF da pessoa física: ");
        cpf = entrada.next();
        System.out.println("Insira o nome da pessoa física: ");
        nome = entrada.next();
        System.out.println("Insira o ano de inscrição da pessoa física: ");
        anoInscricao = entrada.nextInt();
        PessoaFisica pessoaFisica = new PessoaFisica(cpf, nome, anoInscricao);
        System.out.println("Adicione o valor da base da pessoa física: ");
        pessoaFisica.setBase(entrada.nextDouble());
        do {
            System.out.println("Insira o valor de uma venda para pessoa física: ");
            venda = entrada.nextDouble();
            pessoaFisica.addCompras(venda);
        } while (venda != 0);

        System.out.println("Insira o CGC da pessoa jurídica: ");
        cgc = entrada.next();
        System.out.println("Insira o nome da pessoa jurídica: ");
        nome = entrada.next();
        System.out.println("Insira o ano de inscrição da pessoa jurídica: ");
        anoInscricao = entrada.nextInt();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(cgc, nome, anoInscricao);
        System.out.println("Insira a taxa de incentivo da pessosa jurídica: ");
        pessoaJuridica.setTaxaIncentivo(entrada.nextDouble());
        do {
            System.out.println("Insira o valor de uma venda para pessoa jurídica: ");
            venda = entrada.nextDouble();
            pessoaJuridica.addCompras(venda);
        } while (venda != 0);

        entrada.close(); // fechando o Scanner para evitar "resource leak"

        //outputs pessoa física.
        System.out.println("\n\nNome da pessoa física: " + pessoaFisica.getNome());
        System.out.println("Ano de inscrição da pessoa física: " + pessoaFisica.getAnoInscricao());
        System.out.println("Total de vendas(compras) da pessoa física: " + pessoaFisica.getTotalCompras());
        System.out.println("Bônus da pessoa física: " + pessoaFisica.calcBonus(LocalDate.now().getYear())); // podia ser 2025 também, mas o método é legal.
        System.out.println("CPF da pessoa física: " + pessoaFisica.getCpf());
        System.out.println("Valor base da pessoa física: " + pessoaFisica.getBase());
        //outputs pessoa jurídica.
        System.out.println("\n\nNome da pessoa jurídica: " + pessoaJuridica.getNome());
        System.out.println("Ano de inscrição da pessoa jurídica: " + pessoaJuridica.getAnoInscricao());
        System.out.println("Total de vendas(compras) da pessoa jurídica: " + pessoaJuridica.getTotalCompras());
        System.out.println("Bônus da pessoa jurídica: " + pessoaJuridica.calcBonus(LocalDate.now().getYear())); // podia ser 2025 também, mas o método é legal.
        System.out.println("CGC da pessoa jurídica: " + pessoaJuridica.getCgc());
        System.out.println("Taxa de incentivo da pessoa jurídica: " + pessoaJuridica.getTaxaIncentivo());
    }

}
