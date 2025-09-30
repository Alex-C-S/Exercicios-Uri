import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero do funcionario: ");
        int numero = sc.nextInt();
        System.out.println("Me informe as horas trabalhadas do funcionario: ");
        int horas = sc.nextInt();
        System.out.println("Me informe o valor recebido por hora");
        double valor = sc.nextDouble();
        double total = (double) horas * valor;
        System.out.printf("NUMBER = %d%nSALARY = US %.2f", numero, total);
    }
}
