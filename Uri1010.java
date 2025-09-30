import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o codigo da primeira peça: ");
        int codigo1 = sc.nextInt();
        System.out.println("Me informe a quantidade da primeira peça");
        int quantidade1 = sc.nextInt();
        System.out.println("Me informe o valor de cada uniadade da primeira peça: ");
        double valor1 = sc.nextDouble();

        System.out.println("Me informe o codigo da segunda peça: ");
        int codigo2 = sc.nextInt();
        System.out.println("Me informe a quantidade da segunda peça");
        int quantidade2 = sc.nextInt();
        System.out.println("Me informe o valor de cada uniadade da segunda peça: ");
        double valor2 = sc.nextDouble();

        double total = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);


    }
}
