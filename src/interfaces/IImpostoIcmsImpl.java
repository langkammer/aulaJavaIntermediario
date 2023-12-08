package interfaces;

public class IImpostoIcmsImpl implements IImposto {
    private double preco;
    @Override
    public double alicota() {
        return  0.30;
    }

    @Override
    public double calcular() {
        return this.preco * this.alicota();
    }

    @Override
    public String nomeImposto() {
        return "ICMS";
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
