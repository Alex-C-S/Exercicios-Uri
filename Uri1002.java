import java.util.Locale;
import java.util.Scanner;
public class Uri1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe o valor de n: ");
        double n = scanner.nextDouble();
        double area = 3.14169 * Math.pow(n, 2);
        System.out.println("A =" + area);
    }
}
