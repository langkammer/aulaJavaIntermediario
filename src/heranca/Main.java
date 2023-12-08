package heranca;

import heranca.Vendedor;

public class Main {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.altura = 1.81;
        vendedor.cor = "Branco";
        vendedor.documento = "123";
        vendedor.nome = "Fulano";
        vendedor.empresa = "Teste";
        vendedor.clientes = new String[] {"Empresa Teste 1", "Empresa Teste 2"};
        vendedor.funcao = "heranca.Vendedor Senior";
        vendedor.meta = 20.000;

        System.out.println("Nome do vendedor é " + vendedor.nome);


    }
}
