import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de Curtidas: ");
        int curtidas = sc.nextInt();
        System.out.println("Digite a quantidade de Comentários: ");
        int comentarios = sc.nextInt();
        System.out.println("Digite a quantidade de Compartilhamentos: ");
        int compartilhamentos = sc.nextInt();
        System.out.println("Digite a quantidade de Seguidores: ");
        int seguidores = sc.nextInt();
        Engajamento e = new Engajamento(curtidas, comentarios, compartilhamentos, seguidores);
        e.exibirDetalhesPostagem();
    }
}