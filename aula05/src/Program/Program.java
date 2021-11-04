package Program;

import Funcionarios.Administrativo;
import Funcionarios.Assistente;
import Funcionarios.Funcionario;

public class Program {
    public static void main(String[] args) {
        Assistente edi = new Assistente("Edi",15,13041991);
        System.out.println(edi.exibeDados());
        edi.aumentaSalario(15);
        System.out.println(edi.exibeDados());

        Administrativo iuri = new Administrativo("Iuri",20,21122989,"noturno");
        System.out.println(iuri.exibeDados());
        iuri.adicionalNoturno(10);
        iuri.bonusSalarial();
        System.out.println(iuri.exibeDados());



    }
}
