import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de km ");
        int km = sc.nextInt();
        int total = km * 2;
        System.out.println(total + " minutos");
    }
}
