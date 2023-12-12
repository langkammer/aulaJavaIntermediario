package threads;

public class MainMultiThread {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        for (int i = 0; i <= 10; i ++) {
            new Thread(pessoa).start();
        }

        sleep();

        System.out.println("Idade : " +pessoa.idade);

    }

    private static void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
