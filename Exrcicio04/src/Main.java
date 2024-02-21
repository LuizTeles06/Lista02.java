import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double n1, n2, media, rec = 0, media2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota:");

        n1 = scanner.nextDouble();

        System.out.println("Digite outra nota");

        n2 = scanner.nextDouble();

        media = (n1 + n2) /2;


        if (media >= 50 ) {

            System.out.println("Aprovado");
        }

        else {

            System.out.println("Reprovado");

            System.out.println("Digite a nota de recuperação");
            rec = scanner.nextDouble();
        }

        media2 = (media + rec) / 2;

        if (media2 > 50) {

            System.out.println("Aprovado na recuperação");
        }

        else  {

            System.out.println("Reprovado Novamente");
        }

        scanner.close();
    }
}