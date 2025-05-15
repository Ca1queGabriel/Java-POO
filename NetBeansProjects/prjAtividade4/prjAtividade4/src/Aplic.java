import fatec.poo.model.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author caique
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String sigla, descricao, cargaHoraria;
        int qtdevagas, titularidade, areaAtuacao, escolaridade;
        String nome, dtNascimento, endereco, cidade, regfunc;
        String ra;
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        Aluno[] alunos;
        System.out.println("Qual a sigla do curso: ");
        sigla = entrada.next();
        System.out.println("Insira a descrição do curso: ");
        descricao = entrada.next();
        System.out.println("Insira a cargaHoraria: ");
        cargaHoraria = entrada.next();

        Curso curso = new Curso(sigla, descricao, cargaHoraria);


        System.out.println("Qual a sigla da turma: ");
        sigla = entrada.next();
        System.out.println("Qual a quantidade de vagas da turma: ");
        qtdevagas = entrada.nextInt();

        Turma turma = new Turma(sigla, qtdevagas);
        


        System.out.println("Insira o registro de funcionario do professor: ");
        regfunc = entrada.next();
        System.out.println("Insira a titularidade do professor: ");
        titularidade = entrada.nextInt();
        System.out.println("Insira a area de atuacao do professor: ");
        areaAtuacao = entrada.nextInt();
        System.out.println("Insira o nome do professor: ");
        nome = entrada.next();
        System.out.println("Insira a data de nascimento do professor: ");
        dtNascimento = entrada.next();
        System.out.println("Insira o endereco do professor: ");
        endereco = entrada.next();
        System.out.println("Insira a cidade do professor: ");
        cidade = entrada.next();
        
        Professor professor = new Professor(regfunc, titularidade, areaAtuacao, nome, dtNascimento, endereco, cidade);

        turma.setCurso(curso);
        turma.setProfessor(professor);
        professor.setTurmas(turma);
        alunos = new Aluno[qtdevagas];

    for(int cont=0;cont<turma.getQtdevagas();cont++){

        System.out.println("Insira o nome do aluno: ");
        nome = entrada.next();
        System.out.println("Insira a data de nascimento do aluno: ");
        dtNascimento = entrada.next();
        System.out.println("Insira o endereco do aluno: ");
        endereco = entrada.next();
        System.out.println("Insira a cidade do aluno: ");
        cidade = entrada.next();
        System.out.println("Insira o ra do aluno: ");
        ra = entrada.next();
        System.out.println("Insira a escolaridade do aluno: ");
        escolaridade = entrada.nextInt();
        alunos[cont] = new Aluno(nome, dtNascimento, endereco, cidade, ra, escolaridade);
        turma.addAlunos(alunos[cont]);
    }
        turma.listarAlunos();
    }

}
