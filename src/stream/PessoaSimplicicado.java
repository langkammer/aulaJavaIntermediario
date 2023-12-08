package stream;

public class PessoaSimplicicado {
    private String nome;
    private String telefone;

    public PessoaSimplicicado(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public PessoaSimplicicado() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
