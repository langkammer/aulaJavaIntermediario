package threads;

public class ContaBancaria {
    double saldo;
    boolean estaSendoAtualizada;

    synchronized void soma(double valor) {
        if (!estaSendoAtualizada) {
            estaSendoAtualizada = true;
            System.out.println("Somando Valores " + valor);
            saldo += valor;
            estaSendoAtualizada = false;

        }

        notify();

        try {
            while (estaSendoAtualizada) {
                    wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized void subtrair(double valor) {
        if (!estaSendoAtualizada) {
            estaSendoAtualizada = true;
            System.out.println("Subtração Valores " + valor);
            saldo -= valor;
            estaSendoAtualizada = false;
        }

        notify();

        try {
            while (estaSendoAtualizada) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized void  imprimeSaldo() {
        if (!estaSendoAtualizada) {
            System.out.println("Saldo Atual é R$ " + saldo);
        }

        notify();

        try {
            while (estaSendoAtualizada) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
