import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado: ");
        double numero = sc.nextDouble();
        if(numero  <= 25 && numero >= 0){
            System.out.println("Intervalo entre 0, 25");
        }else if(numero <= 50 && numero >= 25.01){
            System.out.println("Intervalo entre 25, 50");
        }else if(numero <= 75 && numero >= 50.1){
            System.out.println("Intervalo entre 50, 75");
        }else if (numero <= 100 && numero >= 75.01){
            System.out.println("Intervalo entre 75, 100");
        }else{
            System.out.println("Fora do intervalo");
        }
    }
}
