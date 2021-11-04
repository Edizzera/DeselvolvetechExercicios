package Imoveis;

import javax.swing.*;

public class TesteImovel {
    public static void main(String[] args) {

        String opt = JOptionPane.showInputDialog("Digite 1 para Novo, 2- para Velho");

        switch (opt){
            case "1":
                Novo novo = new Novo();
                novo.setPreco(100);
                novo.imprimeValor();
                break;
            case "2":
                Velho velho = new Velho();
                velho.setPreco(200);
                velho.imprimeValor();
                break;

        }

    }
}
