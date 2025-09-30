import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.println("Me informe o segundo valor: ");
        int b = scanner.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
    }
}
