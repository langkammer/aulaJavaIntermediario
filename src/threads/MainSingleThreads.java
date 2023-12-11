package threads;

public class MainSingleThreads {

    private static Runnable somaOperacao = new Runnable() {

        @Override
        public void run() {
            double saldo = 10;

            double operacaoSoma = 10;

            saldo += operacaoSoma;

            System.out.println("Soma depois o Saldo Final é R$ " + saldo);
        }
    };

    private static Runnable dimunuirOperacao = new Runnable() {

        @Override
        public void run() {
            double saldo = 30;

            double operacaoSoma = 10;

            saldo -= operacaoSoma;

            System.out.println("Subtração depois o Saldo Final é R$ " + saldo);
        }
    };

    public static void main(String[] args) {


        Thread threadSoma = new Thread(somaOperacao);
        threadSoma.start();

        Thread threadSubtracao = new Thread(dimunuirOperacao);
        threadSubtracao.start();

        
    }
}
