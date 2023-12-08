package lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

public class MainLista {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pessoa Teste 1");
        pessoa1.setAtivo(true);
        pessoa1.setTelefone("11111111");
        pessoa1.setDataNascimento(new Date());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Pessoa Teste 2");
        pessoa2.setAtivo(true);
        pessoa2.setTelefone("2222222");
        pessoa2.setDataNascimento(new Date());


        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Pessoa Teste 3");
        pessoa3.setAtivo(false);
        pessoa3.setTelefone("3333333");
        pessoa3.setDataNascimento(new Date());


        List<Pessoa> listaPessoa = asList(pessoa1, pessoa2, pessoa3);



        int contador = 0;
        while (contador <  listaPessoa.size()) {
            System.out.println("While Pessoa : [" + contador + " ] : Nome  " + listaPessoa.get(contador).getNome());
            contador++;
        }

        for (int contadorFor = 0; contadorFor < listaPessoa.size(); contadorFor ++) {
            System.out.println("For Pessoa : [" + contadorFor + " ] : Nome  " + listaPessoa.get(contadorFor).getNome());

        }

        for(Pessoa pessoa : listaPessoa) {
            System.out.println("For sem posicao For Pessoa : " + pessoa.getNome());
        }

        listaPessoa.stream().forEach(pessoa -> {
            System.out.println("For sem foreach For Pessoa : " + pessoa.getNome());
        });

    }
}
