import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe o valor da primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Me informe o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 * 3.5 + nota2 * 7.5) / 11;
        System.out.printf("MEDIA = %.5f", media);
    }
}
