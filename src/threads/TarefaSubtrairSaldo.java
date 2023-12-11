package threads;

public class TarefaSubtrairSaldo implements Runnable {

    public Thread t;
    private ContaBancaria contaBancaria;

    private double valor;

    public TarefaSubtrairSaldo(ContaBancaria contaBancaria, double valor) {
        this.t = new Thread(this, "Tarefa Subtrair Saldo");
        this.contaBancaria = contaBancaria;
        this.valor = valor;
        this.t.start();

    }


    @Override
    public void run() {
        this.contaBancaria.subtrair(this.valor);

    }
}
