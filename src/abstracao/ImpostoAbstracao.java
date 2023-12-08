package abstracao;

public abstract class ImpostoAbstracao {

    private double preco;

    abstract double alicota();

    abstract double calcular();

    abstract String nomeImposto();

    abstract double valorTotalComImposto();

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
