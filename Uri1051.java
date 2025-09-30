import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe seu salario: ");
        double salario = sc.nextDouble();
        double imposto = 0.0;
        if(salario <= 2000.00){
            System.out.println("Isento");
        }else if(salario <= 3000.00){
            imposto = (salario - 2000.0) * 0.08;

        }else if(salario <= 4500.00){
            imposto =  1000.0 * 0.08 + (salario  - 3000.0) * 0.18;
            System.out.printf("%.2f", imposto);
        }else{
            imposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
            System.out.printf("%.2f", imposto);
        }
    }
}
