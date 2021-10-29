package menu;

import pessoas.Cliente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        MenuItem enumMenu;
        do {
            Integer resposta = montaMenu();
            enumMenu = MenuItem.getEnumFromValor(resposta);
            switch (enumMenu) {
                case CADASTRAR_CLIENTE :
                    cadastraCliente(clientes);

                    break;
                case PESQUISA_CLIENTE_NOME:

                    break;
                case PESQUISA_CLIENTE_CPF:

                    break;
                case PESQUISA_TOTAL_PESSOAS:

                    break;
                case SAIR:
                    System.exit(0);
                    break;
            }
        } while(enumMenu != MenuItem.SAIR);

    }


    private static int montaMenu(){
        String mnu = "";
        mnu+=("Escolha Uma Opcao:\n");
        for(MenuItem item : MenuItem.values()){
            mnu += item.getNome() + "\n";
        }
        return  Integer.parseInt(JOptionPane.showInputDialog(mnu));
    }

    public static void cadastraCliente(List<Cliente> clientes) {

        String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente? ");
        String cpfCliente = JOptionPane.showInputDialog("Qual o cpf do Cliente? ");
        int idadeCliente = Integer.parseInt( JOptionPane.showInputDialog("Qual idade do Cliente? "));
        String generoCliente = JOptionPane.showInputDialog("Qual o gênero do Cliente? ");

        Cliente cliente = new Cliente(nomeCliente,cpfCliente,idadeCliente,generoCliente);
        clientes.add(cliente);

    }
}
