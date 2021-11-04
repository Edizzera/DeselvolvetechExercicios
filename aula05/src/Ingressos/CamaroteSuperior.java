package Ingressos;

public class CamaroteSuperior {
    private int adicional = 400;

    public double valorCamaroteSuperior() {
        double valorCamarote = Ingresso.valor  + adicional;
        return valorCamarote;
    }


}
