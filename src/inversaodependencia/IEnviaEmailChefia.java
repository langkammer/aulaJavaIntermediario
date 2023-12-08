package inversaodependencia;

public class IEnviaEmailChefia implements IEnviaEmail {

    @Override
    public void enviar(){
        System.out.println("Enviou email! de Chefia");
    }
}
