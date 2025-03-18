/**
 *
 * @author 0030482323024
 */
import java.util.Scanner;
import fatec.poo.model.ContaCorrente;

public class Aplic {
    public static void main(String[] args) {
    int tipo,numeroConta;
    double saldo;
    Scanner Entrada = new Scanner(System.in);

    System.out.println("Insira o número da conta: ");
    numeroConta = Entrada.nextInt();
    System.out.println("Insira o saldo da conta: ");
    saldo = Entrada.nextDouble();
    ContaCorrente objConta = new ContaCorrente(numeroConta, saldo);
    do{
    System.out.println("1 - Depositar"
    + "\n2 - Sacar"
    + "\n3 - Consultar Saldo"
    + "\n4 - Sair"
    + "\n Digite a opção: ");
    tipo = Entrada.nextInt();
    switch (tipo){
    case 1:
        System.out.println("Insira a o valor do saque: ");
        double saque = Entrada.nextDouble();
        objConta.sacar(saque);
    case 2:
        
    
    }while(tipo != 0);
    }
   }
}
