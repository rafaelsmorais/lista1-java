public class Emprestimo {
    private double valorEmprestimo;
    private double taxaJuros;
    private int tempo;

    public Emprestimo(double valorEmprestimo, double taxaJuros, int tempo) {
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
        this.tempo = tempo;
    }

    public double calcularJuros() {
        if (this.tempo < 5) {
            return valorEmprestimo;
        } else {
            return valorEmprestimo * tempo * (taxaJuros / 100);
        }
    }
}
