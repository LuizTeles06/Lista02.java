import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double n1, n2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota:");

        n1 = scanner.nextDouble();

        System.out.println("Digite outra nota");

        n2 = scanner.nextDouble();


        if ((n1 + n2) / 2 > 50 ) {


            System.out.println("Aprovado");
        }
        else {

            System.out.println("Reprovado");
        }
        scanner.close();
    }
}