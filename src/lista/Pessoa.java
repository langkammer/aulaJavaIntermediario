package lista;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String telefone;
    private boolean ativo;

    private Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, boolean ativo, Date dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = ativo;
        this.dataNascimento = dataNascimento;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
