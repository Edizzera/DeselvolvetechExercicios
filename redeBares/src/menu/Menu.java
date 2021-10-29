package menu;

import pessoas.Cliente;
import util.Genero;

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
                    pesquisaClienteNome(clientes);

                    break;
                case PESQUISA_CLIENTE_CPF:
                    pesquisaClienteCpf(clientes);

                    break;
                case PESQUISA_TOTAL_PESSOAS:
                    totalPessoas(clientes);

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
    private static  int setGenero(){
        String status = """
                Informe o Genero do Cliente:
                1- Masculino
                2- Feminino\s
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(status));
    }

    public static void cadastraCliente(List<Cliente> clientes) {

        String nomeCliente = JOptionPane.showInputDialog("Qual o nome do Cliente? ");
        String cpfCliente = JOptionPane.showInputDialog("Qual o cpf do Cliente? ");
        int idadeCliente = Integer.parseInt( JOptionPane.showInputDialog("Qual idade do Cliente? "));
        Genero generoCliente;
        Integer resp = setGenero();
        generoCliente = Genero.getEnumFromValor(resp);

        Cliente cliente = new Cliente(nomeCliente,cpfCliente,idadeCliente,generoCliente);
        clientes.add(cliente);
    }

    public static void pesquisaClienteNome(List<Cliente> clientes) {
        String nomePesquisa = JOptionPane.showInputDialog("Qual o nome do Cliente? ");
        boolean flag = false;
        if (clientes.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não há clientes cadastrados com o nome" + nomePesquisa);
        }
        else {
            for (Cliente cliente : clientes) {
                if (cliente.getNome().equals(nomePesquisa)) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                    flag = true;
                }
            }
            if(!flag) {
                JOptionPane.showMessageDialog(null, "Não encontrou o Cliente");
            }
        }

    }

    public static void pesquisaClienteCpf(List<Cliente> clientes) {
        String cpfPesquisa = JOptionPane.showInputDialog("Qual o CPF do Cliente? ");
        boolean flag = false;
        if (clientes.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não há clientes cadastrados com o CPF" + cpfPesquisa);
        }
        else {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(cpfPesquisa)) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                    flag = true;
                }
            }
            if(!flag) {
                JOptionPane.showMessageDialog(null, "Não encontrou o Cliente");
            }
        }

    }

    public static void totalPessoas(List<Cliente> clientes) {
        int contadorPessoas = 0;
        int contadorMasc = 0;
        int contadorFem = 0;
        String masculino = "Masculino";
        boolean flag = false;
        if(clientes.isEmpty())
            JOptionPane.showMessageDialog(null,"Não há Clientes");
        else{
            for(Cliente statusPesq : clientes){
                Genero generos = statusPesq.getGenero();
                if(generos.getNomeGenero().equals(masculino) ) {
                    contadorPessoas++;
                    contadorMasc++;
                }else {
                    contadorPessoas++;
                    contadorFem++;
                }
                flag =true;
            }
            JOptionPane.showMessageDialog(null, "Numero de clientes :" + contadorPessoas + "\n" +
                    "Homens: " + contadorMasc + "\n" + "Mulheres: "+ contadorFem);

            if(!flag){

                JOptionPane.showMessageDialog(null, "Clientes não encontrados!");
            }
        }

    }


}
