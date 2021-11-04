package Funcionarios;

public class Administrativo extends Assistente{
    private String turno;

    public Administrativo() {}

    public Administrativo(String nome, double salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public void bonusSalarial() {
         setSalario(getSalario()*2.0);
    }

    public void adicionalNoturno(double adicional){

        if(turno == "noturno" || turno == "Noturno"){
            setSalario(getSalario() + adicional)  ;
        }

    }
}
