package Funcionarios;

public class Assistente extends Funcionario{
    private int matricula;

    public Assistente() {}

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + "matricula=" + matricula;
    }
}
