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
public class Aluno extends Pessoa{
    private String ra;
    private int escolaridade;
    
    public Aluno(String nome, String dtNascimento, String endereco, String cidade,String ra, int escolariadade){
        super(nome,dtNascimento,endereco,cidade);
        this.ra = ra;
        this.escolaridade = escolaridade;
    }

    public String getRa() {
        return ra;
    }

    public int getEscolaridade() {
        return escolaridade;
    }
    
}
