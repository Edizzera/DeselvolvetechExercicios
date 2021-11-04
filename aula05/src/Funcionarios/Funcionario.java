package Funcionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario( int valorAumento) {
        this.salario += valorAumento;

    }

    public String exibeDados() {
        return "Funcionario " +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ',';
    }
}