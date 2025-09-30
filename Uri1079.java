import java.util.Locale;
import java.util.Scanner;

public class Uri1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de numeros que deseja ser lido");
        double n = sc.nextDouble();
        double nota = 0.0, n1;
        for(int i = 0; i < n ; i ++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double media = (a * 2.0 + b * 3.0 + c * 5.0)/ 10;
            System.out.printf("%.1f", media);
        }
    }
}
