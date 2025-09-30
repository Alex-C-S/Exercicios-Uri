import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a distancia percorrida em KM");
        int km = sc.nextInt();
        System.out.println("Me informe o total de combustivel gasto: ");
        double combustivel = sc.nextDouble();
        double total = (double) km / combustivel;
        System.out.printf("%.3f km/1", total );
    }
}
