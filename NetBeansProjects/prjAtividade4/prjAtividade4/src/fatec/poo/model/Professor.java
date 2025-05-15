/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
public class Professor extends Pessoa{
    private String RegFunc;
    private int titularidade, areaAtuacao;
    private Turma[] turmas;
    private int numTurmas;

    public Professor(String RegFunc, int titularidade, int areaAtuacao, String nome, String dtNascimento, String endereco, String cidade) {
        super(nome, dtNascimento, endereco, cidade);
        this.RegFunc = RegFunc;
        this.titularidade = titularidade;
        this.areaAtuacao = areaAtuacao;
        turmas = new Turma[10];
    }
       
    public void setTurmas(Turma turma){
        turmas[numTurmas] = turma;
        numTurmas++;
    }
    
    public Turma getTurma(int indice){
        return turmas[indice];
    }
}
