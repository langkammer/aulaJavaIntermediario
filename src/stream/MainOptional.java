package stream;

import java.util.Objects;
import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) throws Exception {
        String carro = null;

        String resultado = Optional.ofNullable(carro)
                .map(item -> "Carro é : " + item)
                .orElseThrow(() -> new Exception("Não Veio Carro"));

        System.out.println(resultado);
    }
}
