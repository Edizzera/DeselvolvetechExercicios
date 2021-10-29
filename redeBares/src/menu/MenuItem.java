package menu;

import java.util.Arrays;

public enum MenuItem {
    CADASTRAR_CLIENTE(1,"1 - Cadastra Cliente"),
    PESQUISA_CLIENTE_NOME(2,"2 - Pesquisa Cliente Pelo Nome"),
    PESQUISA_CLIENTE_CPF(3,"3 - Pesquisa Cliente pelo Cpf"),
    PESQUISA_TOTAL_PESSOAS(4," 4- Total de Pessoas no Bar"),
    SAIR(5,"5 - Sair");

    private final String nome;
    private final Integer valor;

    MenuItem(Integer valor, String nome) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {return nome;}

    public Integer getValor() {
        return valor;
    }

    public static MenuItem getEnumFromValor(final Integer valor) {
        return Arrays.stream(MenuItem.values())
                .filter(enumItem -> enumItem.getValor().equals(valor))
                .findFirst()
                .orElse(null);
    }
}
