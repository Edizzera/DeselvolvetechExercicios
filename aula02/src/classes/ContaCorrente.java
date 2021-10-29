package classes;

public class ContaCorrente {
   private double saldo;
   private int nroConta;

    public ContaCorrente() {}

    public ContaCorrente(double saldo, int nroConta) {
        this.saldo = saldo;
        this.nroConta = nroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getConta() {
        System.out.println("Numero da Conta: " + nroConta);
        return nroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        double dep = getSaldo() + valor;
        setSaldo(dep);
        System.out.println("Valor depositado:" + valor + "\n" + "Saldo atual: " + getSaldo() );

    }

    public double retirada(double valor) {
        if( getSaldo() <= 0 || getSaldo() < valor) {
            System.out.println("Não é possivel sacar o valor");
        }else{
            System.out.println("Valor retirado: " + valor + "\n" + "Saldo atual: " + (getSaldo() - valor));
        }

        return getSaldo() - valor;
    }
}
