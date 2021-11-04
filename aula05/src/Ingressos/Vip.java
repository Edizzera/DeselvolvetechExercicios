package Ingressos;

public class Vip extends Ingresso{

    public double valorAdicional() {
       double valorVip = Ingresso.valor  + 200;
        return valorVip;
    }
    public void imprimeValor() {
        System.out.println("Ingresso Vip {" +
                "valor= " + valorAdicional() +
                '}');
    }
}
