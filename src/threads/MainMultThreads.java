package threads;

public class MainMultThreads {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.saldo = 1000.00;

        TarefaSomaSaldo ta1 = new TarefaSomaSaldo(contaBancaria, 10);
        TarefaSomaSaldo ta2 = new TarefaSomaSaldo(contaBancaria, 10);
        TarefaSomaSaldo ta3 = new TarefaSomaSaldo(contaBancaria, 10);


        TarefaSubtrairSaldo ta4 = new TarefaSubtrairSaldo(contaBancaria, 10);
        TarefaSubtrairSaldo ta5 = new TarefaSubtrairSaldo(contaBancaria, 10);
        TarefaSubtrairSaldo ta6 = new TarefaSubtrairSaldo(contaBancaria, 10);

        TarefaImprimirSaldo tarefaImprimirSaldo = new TarefaImprimirSaldo(contaBancaria);

        try {
            ta1.t.join();
            ta2.t.join();
            ta3.t.join();
            ta4.t.join();
            ta5.t.join();
            ta6.t.join();
            tarefaImprimirSaldo.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
