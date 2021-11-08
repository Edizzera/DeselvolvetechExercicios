package Program;

public class Elevador {

    private String andar;
    private int totalAndares;
    private int capacidade;
    private int quantidadeAtual;

    public Elevador() {}

    public Elevador(String andar, int totalAndares, int capacidade, int quantidadeAtual) {
        this.andar = andar;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.quantidadeAtual = quantidadeAtual;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andar='" + andar + '\'' +
                ", totalAndares=" + totalAndares +
                ", capacidade=" + capacidade +
                ", quantidadeAtual=" + quantidadeAtual +
                '}';
    }

    public void inicializa(int capacidade, int totalAndares) {

    }

    public void entra(int quantidadeAtual){

    }

    public void sobre(){

    }

    public void desce(){

    }
}
