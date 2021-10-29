package Programa;

import java.util.ArrayList;

public class TesteAgendaTelefonica {
    public static void main(String[] args) {
        AgendaTelefonica ag = new AgendaTelefonica();
        ag.inserir("Duda","12345");
        ag.inserir("Lu","12345");
        ag.inserir("Edu kng","12345");
        ag.inserir("Lais","12345");
        ag.inserir("Jonathan","12345");
        System.out.println(ag.getColecao());
        System.out.println(ag.buscarNumero("Duda"));
        ag.remove("Duda");
        System.out.println(ag.getColecao());
        System.out.println(ag.tamanho());




    }
}
