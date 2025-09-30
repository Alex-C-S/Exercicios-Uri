import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o nome do vendedor: ");
        String nome = sc.nextLine();
        System.out.println("Me informe seu salario fixo: ");
        double salario = sc.nextDouble();
        System.out.println("Me informe o total de vendas realizada no mes");
        double vendas = sc.nextDouble();
        double total = (vendas * 0.15) + salario;
        System.out.printf("TOTAL : %.2f", total);
    }
}
