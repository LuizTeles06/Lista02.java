import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Número entre 1 a 7:");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Valor inválido");
                break;

        }
    }
}