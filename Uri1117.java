import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        double n1 = sc.nextDouble();
        while (n1 < 0.0 || n1 > 10.0){
            System.out.println("Nota invalida. Digite novamente");
            n1 = sc.nextDouble();
        }
        System.out.println("Informe a segunda nota");
        double n2 = sc.nextDouble();
        while(n2 < 0.0 || n2 > 10.0){
            System.out.println("Nota invalida. Digite novamente");
            n2 = sc.nextDouble();
        }
        double media = (n1 + n2)/ 2.0;
        System.out.printf("media = %.2f", media );
    }
}
