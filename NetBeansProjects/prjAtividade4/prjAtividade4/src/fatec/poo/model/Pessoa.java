
package fatec.poo.model;

/**
 *
 * @author 0030482323024
 */
//cyberpunk theme visual studio
public class Pessoa {
    private String nome, dtNascimento, endereco, cidade;
    public Pessoa(String nome, String dtNascimento, String endereco, String cidade){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }
    
}
