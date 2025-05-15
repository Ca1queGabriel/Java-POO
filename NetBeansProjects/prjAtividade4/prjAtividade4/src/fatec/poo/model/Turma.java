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
public class Turma {
    private String sigla;
    private int qtdevagas;
    private Professor professor;
    private Aluno[] alunos;
    private int numAluno;
    private Curso curso;


    public Turma(String sigla, int qtdevagas){
        this.sigla = sigla;
        this.qtdevagas = qtdevagas;
        alunos = new Aluno[qtdevagas];
    }

    public String getSigla() {
        return sigla;
    }

    public int getQtdevagas() {
        return qtdevagas;
    }
    
    //métodos do professor
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
   
    public Professor getProfessor(){
        return professor;
    }
    
    public void addAlunos(Aluno aluno){
        alunos[numAluno] = aluno;
        numAluno++;
    }
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public Curso getCurso(){
        return curso;
    }

    public void listarAlunos(){
        System.out.println("Sigla do curso: "+ getCurso().getSigla() + "\t\tNome do curso: "+ getCurso().getDescricao());
        System.out.println("Sigla Turma: " + sigla);
        System.out.println("Nome do Professor: "+ getProfessor().getNome());
        System.out.println("\nNome do Aluno");
        for(int cont=0;cont<numAluno;cont++){
            System.out.println((cont+1)+ "" + alunos[cont].getNome());
        }
    }
}
