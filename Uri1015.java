import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor: ");
        double x1 = sc.nextDouble();
        System.out.println("Me informe o segundo valor: ");
        double y1 = sc.nextDouble();
        System.out.println("Me informe o terceiro valor: ");
        double x2 = sc.nextDouble();
        System.out.println("Me informe o quarto valor: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt((Math.pow(x2 - x1, 2.0)) + Math.pow(y2 - y1, 2.0));
        System.out.printf("%.4f ", distancia);

    }
}
