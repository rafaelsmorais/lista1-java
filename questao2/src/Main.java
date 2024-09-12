import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();
        System.out.println("Digite a taxa de juros: ");;
        double taxaJuros = sc.nextDouble();
        System.out.println("Digite os dias emprestados: ");
        int tempo = sc.nextInt();

        Emprestimo e = new Emprestimo(valorEmprestimo, taxaJuros, tempo);
        double juros = e.calcularJuros();
        System.out.printf("Valor dos juros: %.2f\n", juros);
    }
}