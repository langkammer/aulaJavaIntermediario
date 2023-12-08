package injecaodependencia;

import interfaces.IImposto;
import interfaces.IImpostoIcmsImpl;
import interfaces.IImpostoIpiImpl;
import interfaces.IImpostoIssImpl;

public class InjecaoMain {

    public static void main(String[] args) {
        IImposto imposto = new IImpostoIcmsImpl();

        Produto produto = new Produto(new IImpostoIcmsImpl(), 5000.00);

        produto.setNome("Iphone 14");


        System.out.println("Nome Produto : " + produto.getNome());
        System.out.println("Valor do produto : R$ " + produto.getPreco());
        System.out.println("Nome do Imposto :  " + produto.getNomeImposto());
        System.out.println("Valor do Imposto Cobrado : R$ " + produto.getValorDoImposto());
        System.out.println("Valor Total : R$ " + produto.getValorTotalComImposto());
    }
}
