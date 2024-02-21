import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double n1, n2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

        n1 = scanner.nextDouble();

        System.out.println("Digite outro número");

        n2 = scanner.nextDouble();


        if (n1 > n2) {


            System.out.println("O numero 1 (" + n1 + ") é maior que o número 2 (" + n2 + ").");
        }
        else {

            System.out.println("O numero 2 (" + n2 + ") é maior que o número 1 (" + n1 + ").");
        }
        scanner.close();
    }
}