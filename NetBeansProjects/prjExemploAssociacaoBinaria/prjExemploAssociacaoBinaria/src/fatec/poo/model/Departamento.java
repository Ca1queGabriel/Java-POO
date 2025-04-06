/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;



/**
 *
 * @author kaues
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; // matriz de ointeiros para objetos multiplicidade 1..*;
    private int numFunc;
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5]; // cada instanciação do departamento cria uma matriz com 5 funcionários;
        numFunc = 0; // não precisa atribuir 0, pois ele já inicia com 0, mas é só pra mostrar a posição inicial;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    //tem como parâmetro de entrada o endereço de um
    //objeto da subclasse FuncionarioHorista, ou da
    //subclasse FuncionarioComissionado
    public void addFuncionario(Funcionario funcionario){
    this.funcionarios[numFunc] = funcionario;
    numFunc++;
    }
    
    public void listarFuncionarios(){
            System.out.println("___________________________________________");
            System.out.println("\nSigla: " + sigla);
            System.out.println("Nome: " + nome);
            System.out.println("Quantidade de funcionários: " + numFunc);
            System.out.println("\nRegistro\tNome\t\tCargo");
            
            for(int cont=0; cont<numFunc;cont++){
                System.out.print(funcionarios[cont].getRegistro());
                System.out.print("\t\t"+funcionarios[cont].getNome());
                System.out.println("\t"+funcionarios[cont].getCargo());
            }
        }
    }

    
 

