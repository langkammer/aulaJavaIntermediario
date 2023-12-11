package threads;

public class TarefaImprimirSaldo implements Runnable {

    public Thread t;
    private ContaBancaria contaBancaria;


    public TarefaImprimirSaldo(ContaBancaria contaBancaria) {
        this.t = new Thread(this, "Imprimir Saldo");
        this.contaBancaria = contaBancaria;
        this.t.start();

    }


    @Override
    public void run() {
        this.contaBancaria.imprimeSaldo();

    }
}
