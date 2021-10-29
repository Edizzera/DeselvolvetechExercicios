package classes;

public class CadastroDeContas {

    private ContaCorrente [] cad = new ContaCorrente[100];
    private int nroContas = 0;

    public boolean novaContaCorrente(ContaCorrente c) {
        boolean res = false;

        if (nroContas < 100 || c != null) {
            cad[nroContas] = c;
            nroContas++;
            res = true;
        }

        return res;
    }

    public ContaCorrente getConta(int nro) {
        ContaCorrente res;

        int i;
        for (i = 0; i < nroContas; i++)
            if (nro == cad[i].getNroConta())
                break;

        if (i == nroContas)
            res = null;
        else
            res = cad[i];

        return res;
    }

    public double getSaldoTotal() {
        double tot = 0;
        for(int i = 0; i < nroContas; i++) {
           tot =   cad[i].getSaldo();
        }

        return tot;
    }

    public int qtdContas(double noMinimo) {
        int cont = 0;
        for ( int i = 0; i < nroContas; i++) {
           double tot = cad[i].getSaldo();
           if (tot >= noMinimo){
               cont++;
               System.out.println("Numero de contas com saldo Maior ou igual ao inserido é de " + cont);
           } else {
               System.out.println("Numero de contas com saldo Maior ou igual ao inserido é de " + cont);
           }
        }

       return cont;
    }
}
