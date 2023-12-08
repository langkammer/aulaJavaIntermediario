package abstracao;

public class Icms extends ImpostoAbstracao{
    @Override
    double alicota() {
        return 0.30;
    }

    @Override
    double calcular() {
        return this.getPreco() * this.alicota();
    }

    @Override
    String nomeImposto() {
        return "ICMS";
    }

    @Override
    double valorTotalComImposto() {
        return this.getPreco() + this.calcular();
    }
}
