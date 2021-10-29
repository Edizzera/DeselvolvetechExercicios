package util;

import java.util.Arrays;

public enum Genero {
    MASCULINO(1,"Masculino"),
    FEMININO(2,"Feminino");

    private final String nome;
    private final Integer valor;

    Genero(Integer valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public String getNomeGenero() {return nome;}
    public Integer getValor() {return valor;}

    public static Genero getEnumFromValor(final Integer valor) {
        return Arrays.stream(Genero.values())
                .filter(enumItem -> enumItem.getValor().equals(valor))
                .findFirst()
                .orElse(null);
    }




}
