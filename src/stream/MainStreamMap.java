package stream;

import lista.Pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MainStreamMap {
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

        List<String> telefonePessoasAtivas = new ArrayList<>();

//        for (Pessoa pessoa : listaPessoa) {
//            if(pessoa.isAtivo()) {
//                telefonePessoasAtivas.add(pessoa.getTelefone());
//            }
//        }
//
//        for (String telefonePessoasAtiva : telefonePessoasAtivas) {
//            System.out.println(telefonePessoasAtiva);
//        }

        List<String> telefonePessoasAtivasMapStream = listaPessoa
                .stream()
                .filter(pessoa -> Objects.equals(pessoa.isAtivo(), true))
                .map(Pessoa::getTelefone)
                .collect(Collectors.toList());

        telefonePessoasAtivasMapStream.forEach(telefone -> System.out.println(telefone));


        List<PessoaSimplicicado> pessoasSimplificadas = listaPessoa
                .stream()
                .filter(pessoa -> Objects.equals(pessoa.isAtivo(), true))
                .map(pessoa -> {
                    PessoaSimplicicado pessoaSimplicicado = new PessoaSimplicicado();
                    pessoaSimplicicado.setNome(pessoa.getNome());
                    pessoaSimplicicado.setTelefone(pessoa.getTelefone());
                    return pessoaSimplicicado;
                })
                .collect(Collectors.toList());

        pessoasSimplificadas.forEach(pessoaSimplicicado -> System.out.println(pessoaSimplicicado.getNome() + " " + pessoaSimplicicado.getTelefone()));
    }
}
