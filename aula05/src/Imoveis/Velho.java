package Imoveis;

public class Velho extends Imovel{

    public int abaixaPreco(){
        int novoValor = getPreco() - 100;
        return novoValor;
    }

    public void imprimeValor() {
        System.out.println(abaixaPreco());
    }

}
