import java.util.Locale;
import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Me informe o primeiro valor: ");
        int b = sc.nextInt();
        System.out.println("Me informe o primeiro valor: ");
        int c = sc.nextInt();
        System.out.println("Me informe o primeiro valor: ");
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
