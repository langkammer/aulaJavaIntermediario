package threads;

public class MainSingleThread {
    public static void main(String[] args) {

       System.out.println("Thread :: " + Thread.currentThread().getName() + " Numero " + Thread.currentThread().getId());
       Runnable tarefaSoma = new Runnable() {
           @Override
           public void run() {
               double a = 10.0;
               double b = 20.0;
               double resultado = a + b;
               System.out.println("tarefaSoma Thread :: " + Thread.currentThread().getName()
                       + " Numero " + Thread.currentThread().getId()
                       + " Resultado da Soma é " + resultado);

               System.out.println(">>>> Num de Threads :: " + Thread.activeCount());

           }
       };

       Runnable tarefaSoma1 = new Runnable() {
            @Override
            public void run() {
                double a = 10.0;
                double b = 20.0;
                double resultado = a + b;
                System.out.println("tarefaSoma1 Thread :: " + Thread.currentThread().getName()
                        + " Numero " + Thread.currentThread().getId()
                        + " Resultado da Soma é " + resultado);
                System.out.println(">>>> Num de Threads :: " + Thread.activeCount());

            }
        };


       Thread thread = new Thread(tarefaSoma);
       Thread thread2 = new Thread(tarefaSoma1);

       System.out.println(">> Num de Threads :: " + Thread.activeCount());

       thread.start();
       thread2.start();

       sleep();

       System.out.println(">>> Num de Threads :: " + Thread.activeCount());


    }

    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
