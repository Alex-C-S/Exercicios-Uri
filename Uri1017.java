import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me infome o tempo gasto");
        int tempo = sc.nextInt();
        System.out.println("Me informe a velidade durante a viagem");
        int velocidade = sc.nextInt();
        double total = (double) (tempo * velocidade)/12.0;
        System.out.printf("%.3f", total );
    }
}
