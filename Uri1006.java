import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe o valor da priemeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Me infomre o valor da segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Me informe o valor da terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 +3+5);
        System.out.printf("MEDIA = %.1f", media);
    }
}
