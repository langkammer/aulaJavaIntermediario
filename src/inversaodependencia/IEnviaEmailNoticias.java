package inversaodependencia;

public class IEnviaEmailNoticias implements IEnviaEmail {

    @Override
    public void enviar(){
        System.out.println("Enviou email! de Noticias");
    }
}
