package inversaodependencia;

public class InversaoDependenciaMain {

    public static void main(String[] args) {
        IEnviaEmailChefia enviaEmailChefia = new IEnviaEmailChefia();
        enviaEmailChefia.enviar();

        IEnviaEmail enviaEmail = new IEnviaEmailMemorando();
        enviaEmail.enviar();


//        IEnviaEmail enviaEmail = new IEnviaEmailChefia();
//
//        enviaEmail.enviar();
//
//        enviaEmail = new IEnviaEmailNoticias();
//
//        enviaEmail.enviar();
//
//        enviaEmail = new IEnviaEmailMemorando();
//
//        enviaEmail.enviar();



    }
}
