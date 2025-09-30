import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        for(int i = 0; i < 6; i++){
            System.out.println("Me informe o valor " + (i + 1));
            Double numero = sc.nextDouble();
            if(numero > 0){
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");
    }
}

