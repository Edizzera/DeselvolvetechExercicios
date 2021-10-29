package classes;

public class CadastroDeContas {
    public static void main(String[] args) {
        ContaCorrente edi = new ContaCorrente(10,3245);
        novaContaCorrente(edi);
        edi.deposito(10);
        edi.retirada(13);
        edi.getConta();
    }


    static boolean novaContaCorrente(ContaCorrente c){

        if( c != null) {
            System.out.println("Conta criada com Sucesso");
            return true;
        } else {
            System.out.println("Conta Não foi criada");
            return false;
        }

        
    }





}
