import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor: ");
        double n1 = sc.nextDouble();
        System.out.println("Me informe o segundo valor: ");
        double n2 = sc.nextDouble();
        System.out.println("Me informe o terceiro valor: ");
        double n3 = sc.nextDouble();
        if(n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {
            double p = n1 + n2 + n3;
            System.out.printf("Perimetro = %.1f", p);
        }else{
            double area = (n1 + n2) * n3 / 2;
            System.out.printf("Area = %.1f", area);
        }
    }
}
