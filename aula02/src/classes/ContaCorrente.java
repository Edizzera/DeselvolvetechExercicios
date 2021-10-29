package classes;

public class ContaCorrente {
    private double saldo = 0.0;
    private int nroConta;

    public ContaCorrente(int n) {
        nroConta = n;
    }

    public void deposito(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    public double retirada(double valor) {
        if (saldo - valor >= 0)
            saldo -= valor;

        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNroConta() {
        return nroConta;
    }
}
