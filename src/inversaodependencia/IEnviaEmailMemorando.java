package inversaodependencia;

public class IEnviaEmailMemorando implements IEnviaEmail {

    @Override
    public void enviar(){
        System.out.println("Enviou email! de Memorando");
    }
}
