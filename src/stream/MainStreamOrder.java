package stream;

import lista.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class MainStreamOrder {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jose");
        pessoa1.setAtivo(true);
        pessoa1.setTelefone("11111111");
        pessoa1.setDataNascimento(new Date(1989, 1 ,1));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setAtivo(true);
        pessoa2.setTelefone("2222222");
        pessoa2.setDataNascimento(new Date(1980, 1 , 1));


        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Pedro");
        pessoa3.setAtivo(false);
        pessoa3.setTelefone("3333333");
        pessoa3.setDataNascimento(new Date(1999, 1, 1));

        List<Pessoa> listaPessoas = Arrays.asList(pessoa1, pessoa2, pessoa3);


        List<PessoaSimplicicado> listaPessoasOrdenadasPorNome = listaPessoas
                .stream()
                .sorted(Comparator.comparing(Pessoa::getDataNascimento))
                .map(pessoa -> {
                    PessoaSimplicicado pessoaSimplicicado = new PessoaSimplicicado();
                    pessoaSimplicicado.setNome(pessoa.getNome());
                    pessoaSimplicicado.setTelefone(pessoa.getTelefone());
                    return pessoaSimplicicado;
                })
                .collect(Collectors.toList());

        listaPessoasOrdenadasPorNome.forEach(pessoa -> System.out.println(pessoa.getNome()));



    }
}
