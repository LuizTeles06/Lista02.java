import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double n1, valido, invalido;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número entre 5 e 9:");

        n1 = scanner.nextDouble();







        if (n1 >=5 && n1 <9 )  {

            System.out.println("Entrada liberada");
        }

        else  {

                System.out.println("Entrada invalida");
            }



        scanner.close();
    }
}