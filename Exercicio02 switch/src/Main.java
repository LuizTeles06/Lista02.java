import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        System.out.println("Digite outro número");
        double n2 = scanner.nextDouble();
        System.out.println("menu:");
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Multiplicação");
        System.out.println("4.Divisão");
        System.out.println("Escolha uma opção");
        int opcao = scanner.nextInt();


        switch (opcao) {

            case 1:
                double soma = n1 + n2;
                System.out.println("seu resultado é: " + soma);
                break;

            case 2:
                double subtracao = n1 - n2;
                System.out.println("Seu resultado é: " + subtracao);
                break;

            case 3:
                double multiplicacao = n1 * n2;
                System.out.println("Seu resultado é: " + multiplicacao);
                break;

            case 4:
                double divisao = n1 / n2;
                System.out.println("Seu resultado é: " + divisao);
                break;

            default:
                System.out.println("Valor inválido");
                break;

        }
    }
}
