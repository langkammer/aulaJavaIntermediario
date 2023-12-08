package abstracao;

public class Ipi extends ImpostoAbstracao{
    @Override
    double alicota() {
        return 0.20;
    }

    @Override
    double calcular() {
        return this.getPreco() * this.alicota();
    }

    @Override
    String nomeImposto() {
        return "IPI";
    }

    @Override
    double valorTotalComImposto() {
        return this.getPreco() + this.calcular();
    }
}
