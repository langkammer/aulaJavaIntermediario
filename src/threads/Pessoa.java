package threads;

public class Pessoa implements Runnable {

    public int idade = 0;

    synchronized void somaIdade() {
        idade ++;
        System.out.println("Thread ::" + Thread.currentThread().getName()
                + " Num : " + Thread.currentThread().getId()
                + " A idade da pessoa é " + idade);
    }

    @Override
    public void run() {
        somaIdade();
    }
}
