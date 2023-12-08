package injecaodependencia;

import interfaces.IImposto;

public class Produto {
    private String nome;
    private double preco;
    private double valorDoImposto;
    private double valorTotalComImposto;

    private IImposto imposto;

    public Produto(final IImposto imposto, double preco) {
        this.imposto = imposto;
        this.preco = preco;
        this.imposto.setValorPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }




    public double getValorDoImposto() {
        return this.imposto.calcular();
    }

    public double getValorTotalComImposto() {
        return this.imposto.valorTotalComImposto();
    }

    public String getNomeImposto() {
        return this.imposto.nomeImposto();
    }
}
