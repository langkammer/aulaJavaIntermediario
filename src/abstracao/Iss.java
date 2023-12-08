package abstracao;

public class Iss extends ImpostoAbstracao{
    @Override
    double alicota() {
        return 0.10;
    }

    @Override
    double calcular() {
        return this.getPreco() * this.alicota();
    }

    @Override
    String nomeImposto() {
        return "ISS";
    }

    @Override
    double valorTotalComImposto() {
        return this.getPreco() + this.calcular();
    }
}
