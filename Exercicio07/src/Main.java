import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe os coeficientes a, b e c
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Calcula o discriminante
        double delta = b * b - 4 * a * c;

        // Verifica o valor do discriminante
        if (delta > 0) {
            // Duas raízes reais diferentes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            // Duas raízes reais iguais
            double x = -b / (2 * a);
            System.out.println("A raiz única é: x = " + x);
        } else {
            // Não há raízes reais
            System.out.println("Não há raízes reais para a equação fornecida.");
        }

        scanner.close();
    }
}