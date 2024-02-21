import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double n1, n2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");

        n1 = scanner.nextDouble();


        if ( n1 % 2 == 0) {


            System.out.println("par");
        }
        else {

            System.out.println("ímpar");
        }
        scanner.close();
    }
}