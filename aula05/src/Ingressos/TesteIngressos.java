package Ingressos;

import javax.swing.*;

public class TesteIngressos {
    public static void main(String[] args) {
        Vip ingresso = new Vip();
        ingresso.imprimeValor();
        CamaroteInferior ing = new CamaroteInferior();
        ing.imprimeLocal();
        CamaroteSuperior cam = new CamaroteSuperior();
        System.out.println(cam.valorCamaroteSuperior());

        String opt = JOptionPane.showInputDialog("Escolha um Numero: 1 Normal, 2 Vip");
        switch (opt) {
            case "1":
                Normal ingressoNormal = new Normal();
                JOptionPane.showMessageDialog(null, ingressoNormal.ingressoNormal());
                break;
            case "2":
                String opt2 = JOptionPane.showInputDialog("Escolha um Numero: 1- Camorote Superior , 2 Camorte Inferior");
                if (opt2.equals("1")) {
                    CamaroteSuperior camSup = new CamaroteSuperior();
                    JOptionPane.showMessageDialog(null, "Camarote Superior valor :" + camSup.valorCamaroteSuperior());
                    break;
                }

                CamaroteInferior camInf = new CamaroteInferior();
                JOptionPane.showMessageDialog(null, "Camarote Inferior valor:" + camInf.valorAdicional());
                break;


        }


    }
}
