package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MainGrouping {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Robson1", "Teste", false, new Date());
        Pessoa pessoa2 = new Pessoa("Robson2", "Teste", true, new Date());
        Pessoa pessoa3 = new Pessoa("Robson3", "Teste", false, new Date());
        Pessoa pessoa4 = new Pessoa("Robson4", "Teste", true, new Date());


        List<Pessoa> listaPessoa = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4);

        Map<Boolean, List<Pessoa>> MAP_DE_AGRUPAMENTO = listaPessoa
                .stream()
                .collect(Collectors.groupingBy(Pessoa::isAtivo));

        MAP_DE_AGRUPAMENTO.keySet().forEach(p -> {
            System.out.println("Pessoas " + p);
            MAP_DE_AGRUPAMENTO.get(p).forEach(pessoa -> System.out.println(pessoa.getNome()));
        });

    }
}
