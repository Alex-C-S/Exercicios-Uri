import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual item deseja");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade que deseja");
        int quantidade = sc.nextInt();
        double total = 0.0;
        switch (codigo){
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
            default:
                System.out.println("Digite uma opção valida");
                break;
        }
        System.out.printf("Total: R$ %.2f", total);

    }
}
