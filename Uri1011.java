import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor do R: ");
        double r = sc.nextDouble();
        double esfera = (4.0/3.0) * 3.14159 * Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f", esfera );
    }
}
