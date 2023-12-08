package interfaces;

public class IImpostoIpiImpl implements IImposto {
    private double preco;
    @Override
    public double alicota() {
        return  0.20;
    }

    @Override
    public double calcular() {
        return this.preco * this.alicota();
    }

    @Override
    public String nomeImposto() {
        return "IPI";
    }

    @Override
    public double valorTotalComImposto() {
        return  this.preco + this.calcular();
    }

    @Override
    public void setValorPreco(double preco) {
        this.preco = preco;
    }
}
