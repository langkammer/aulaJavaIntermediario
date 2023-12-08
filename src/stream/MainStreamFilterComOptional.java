package stream;

import lista.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MainStreamFilterComOptional {
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


        List<Pessoa> listaPessoa = asList(pessoa1, pessoa2, pessoa3);

        Pessoa pessoaFiltrada = listaPessoa.stream()
                .filter(pessoa -> Objects.equals(pessoa.getNome(), "Pessoa Teste 1"))
                .findFirst()
                .orElse(null);

        if (pessoaFiltrada != null) {
            System.out.println("pesoa filtrada " + pessoaFiltrada.getNome());
        }

        Optional<Pessoa> pessoaOptional = listaPessoa.stream()
                .filter(pessoa -> Objects.equals(pessoa.getNome(), "Pessoa Teste 1"))
                .findFirst();

        pessoaOptional.ifPresent(pessoa -> System.out.println("pessoa optional " + pessoa.getNome()));


        Optional<Pessoa> pessoaFiltradaAny = listaPessoa.stream()
                .filter(pessoa -> pessoa.isAtivo())
                .findAny();

        pessoaFiltradaAny.ifPresent(pessoa -> System.out.println("pessoa any " + pessoa.getNome()));


        boolean anyMatch = listaPessoa.stream()
                .anyMatch(pessoa -> pessoa.getDataNascimento().before(new Date()));

        if (anyMatch) {
            System.out.println("Existe pelo menos que nasceu antes de hoje");
        }


        boolean allMatch = listaPessoa.stream()
                .allMatch(pessoa -> pessoa.getDataNascimento().after(new Date()));

        if (allMatch) {
            System.out.println("Todas as datas de nasciemnto são anterios de hoje");
        }

    }
}
