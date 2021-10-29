package pessoas;

import util.Genero;

public class Cliente extends Pessoa {
    private String cpf;
    private int idade;
    private Genero genero;

    public Cliente() {}

    public Cliente(String nome, String cpf, int idade, Genero genero) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return super.toString() +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", genero='" + genero + '\'';
    }
}
