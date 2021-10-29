package Programa;

import java.util.HashMap;


public class AgendaTelefonica {
    private HashMap<String, String> colecao = new HashMap<>();

    public HashMap<String, String> getColecao() {
        return colecao;
    }

    public void setColecao(HashMap<String, String> colecao) {
        this.colecao = colecao;
    }

    public void inserir(String nome, String numero) {
        colecao.put(nome,numero);

    }

    public String buscarNumero(String nome) {
       return colecao.get(nome);
    }

    public void remove(String nome) {
        colecao.remove(nome);

    }

    public int tamanho() {
       return  colecao.size();

    }


}
