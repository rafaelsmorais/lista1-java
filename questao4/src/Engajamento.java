public class Engajamento {
    private int curtidas;
    private int comentarios;
    private int compartilhamentos;
    private int seguidores;

    public Engajamento(int curtidas, int comentarios, int compartilhamentos, int seguidores) {
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.compartilhamentos = compartilhamentos;
        this.seguidores = seguidores;
    }

    public double calcularEngajamento() {
        double interacoes = curtidas + comentarios + compartilhamentos;
        return (interacoes / this.seguidores) * 100;
    }

    public void exibirDetalhesPostagem() {
        System.out.println("Curtidas: " + this.curtidas);
        System.out.println("Comentários: " + this.comentarios);
        System.out.println("Compartilhamentos: " + this.compartilhamentos);
        System.out.println("Seguidores: " + this.seguidores);
        System.out.printf("Percentual de Engajamento: %.2f%%\n", this.calcularEngajamento());
    }
}
