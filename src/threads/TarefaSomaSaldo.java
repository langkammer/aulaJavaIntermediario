package threads;

public class TarefaSomaSaldo implements Runnable {

    public Thread t;
    private ContaBancaria contaBancaria;

    private double valor;

    public TarefaSomaSaldo(ContaBancaria contaBancaria, double valor) {
        this.t = new Thread(this, "Tarefa Soma Saldo");
        this.contaBancaria = contaBancaria;
        this.valor = valor;
        this.t.start();
    }


    @Override
    public void run() {
        this.contaBancaria.soma(this.valor);

    }
}
