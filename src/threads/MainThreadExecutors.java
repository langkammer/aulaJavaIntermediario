package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadExecutors {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable tarefaDeSoma = new Runnable() {
            @Override
            public void run() {
                double resultado =  10 + 50;
                System.out.println("tarefaDeSoma >> Thread :: "
                        + Thread.currentThread().getName()
                        + " " + Thread.currentThread().getId()
                        + " Resultado é >>> " + resultado
                );
            }
        };

        Runnable tarefaDeSubtracao = new Runnable() {
            @Override
            public void run() {
                double resultado =  10 - 50;
                System.out.println("tarefaDeSubtracao >> Thread :: "
                        + Thread.currentThread().getName()
                        + " " + Thread.currentThread().getId()
                        + " Resultado é >>> " + resultado
                );
            }
        };

        Runnable tarefaDeMultiplicacao = new Runnable() {
            @Override
            public void run() {
                double resultado =  10 * 50;
                System.out.println("tarefaDeMultiplicacao >>> Thread :: "
                        + Thread.currentThread().getName()
                        + " " + Thread.currentThread().getId()
                        + " Resultado é >>> " + resultado
                );
            }
        };

        executor.submit(tarefaDeSoma);
        executor.submit(tarefaDeSubtracao);
        executor.submit(tarefaDeMultiplicacao);
        executor.shutdown();

    }


}
