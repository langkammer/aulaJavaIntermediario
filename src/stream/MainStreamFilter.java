package stream;

import lista.Pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MainStreamFilter {
    public static void main(String[] args) {
        lista.Pessoa pessoa1 = new lista.Pessoa();
        pessoa1.setNome("Pessoa Teste 1");
        pessoa1.setAtivo(true);
        pessoa1.setTelefone("11111111");
        pessoa1.setDataNascimento(new Date());

        lista.Pessoa pessoa2 = new lista.Pessoa();
        pessoa2.setNome("Pessoa Teste 2");
        pessoa2.setAtivo(true);
        pessoa2.setTelefone("2222222");
        pessoa2.setDataNascimento(new Date());


        lista.Pessoa pessoa3 = new lista.Pessoa();
        pessoa3.setNome("Pessoa Teste 3");
        pessoa3.setAtivo(false);
        pessoa3.setTelefone("3333333");
        pessoa3.setDataNascimento(new Date());


        List<Pessoa> listaPessoa = asList(pessoa1, pessoa2, pessoa3);

        List<Pessoa> listaDePessoasAtivas = new ArrayList<>();

//
//        for (Pessoa pessoa : listaPessoa) {
//            if (pessoa.isAtivo()) {
//                listaDePessoasAtivas.add(pessoa);
//            }
//        }
//
//        for (Pessoa pessoa : listaDePessoasAtivas) {
//            System.out.println(pessoa.getNome());
//        }

        List<Pessoa> pessoasAtivasStream = listaPessoa
                .stream()
                .filter(Pessoa::isAtivo)
                .collect(Collectors.toList());;



        pessoasAtivasStream.forEach(pessoa -> System.out.println(pessoa.getNome()));


        List<Pessoa> pessoasComTelefone11111111 = listaPessoa
                .stream()
                .filter(pessoa -> Objects.equals(pessoa.getTelefone(), "11111111"))
                .collect(Collectors.toList());

        pessoasComTelefone11111111.forEach(pessoa -> System.out.println(pessoa.getNome()));

    }
}
