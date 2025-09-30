import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de A");
        double a = sc.nextDouble();
        System.out.println("Me informe o valor de B");
        double b = sc.nextDouble();
        System.out.println("Me informe o valor de C");
        double c = sc.nextDouble();

        double trianguloRetangulo = (a * c) / 2.0;
        double circuloRaio = 3.14159 * ( c * c);
        double trapezio = ((a + b) * c )/2.0;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.printf("TRIANGUALO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", trianguloRetangulo, circuloRaio, trapezio, quadrado, retangulo);
    }
}
