package interfaces;

public class MainInterface {
    public static final double PRECO = 300.00;

    public static void main(String[] args) {
        IImposto imposto = new IImpostoIcmsImpl();

        imposto.setValorPreco(PRECO);

        System.out.println("Nome do Imposto : " + imposto.nomeImposto());
        System.out.println("Valor do produto : R$ " + PRECO);
        System.out.println("Valor do Imposto Cobrado : R$ " + imposto.calcular());
        System.out.println("Valor Total : R$ " + imposto.valorTotalComImposto());
    }
}
