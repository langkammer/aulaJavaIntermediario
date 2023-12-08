package abstracao;

import java.util.ArrayList;
import java.util.List;

public class MainAbstracao {

    public static final double PRECO = 300.00;

    public static void main(String[] args) {
        List<ImpostoAbstracao> listaImpostos = new ArrayList<>();
        preenchePrecos(listaImpostos);

        double totalImpostos = 0.0;

        for (ImpostoAbstracao impostoAbstracao : listaImpostos) {
            impressaoImposto(impostoAbstracao);
            totalImpostos += impostoAbstracao.calcular();
        }

        System.out.println("Valor total de todos os tributos é R$ " + totalImpostos);
        System.out.println("Valor total de todos os tributos com preço é R$ " + totalImpostos + PRECO);




    }

    private static void preenchePrecos(List<ImpostoAbstracao> listaImpostos) {

        Icms icms = new Icms();
        icms.setPreco(PRECO);

        Ipi ipi = new Ipi();
        ipi.setPreco(PRECO);

        Iss iss = new Iss();
        iss.setPreco(PRECO);

        listaImpostos.add(icms);
        listaImpostos.add(ipi);
        listaImpostos.add(iss);

    }

    private static void impressaoImposto(ImpostoAbstracao imposto) {
        System.out.println("Nome do Imposto : " + imposto.nomeImposto());
        System.out.println("Valor do produto : R$ " + imposto.getPreco());
        System.out.println("Valor do Imposto Cobrado : R$ " + imposto.calcular());
        System.out.println("Valor Total : R$ " + imposto.valorTotalComImposto());
    }
}
