package Imoveis;

public class Novo extends Imovel{


    public int adicionalPreco(){
        int novoValor = getPreco() + 10000;
        return novoValor;
    }

    public void imprimeValor() {
        System.out.println(adicionalPreco());
    }

}
