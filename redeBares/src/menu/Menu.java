package menu;

import javax.swing.*;

public class Menu {
    public static void main(String[] args) {

        MenuItem enumMenu;
        do {
            Integer resposta = montaMenu();
            enumMenu = MenuItem.getEnumFromValor(resposta);
            switch (enumMenu) {
                case CADASTRAR_CLIENTE :

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
}
