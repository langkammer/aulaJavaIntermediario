package interfaces;

public class IImpostoIssImpl implements IImposto {
    private double preco;
    @Override
    public double alicota() {
        return   0.10;
    }

    @Override
    public double calcular() {
        return this.preco * this.alicota();
    }

    @Override
    public String nomeImposto() {
        return "ISS";
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
