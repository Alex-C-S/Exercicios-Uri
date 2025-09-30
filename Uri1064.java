import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double positivos = 0.0;
        double soma = 0.0;
        for(int i = 0; i < 6; i++){
            System.out.println("Me informe o valor " + ( i + 1));
            double valor = sc.nextDouble();
            if(valor > 0){
                positivos++;
                soma = soma + valor;
            }
        }
       double media = soma / positivos;
        System.out.println(positivos + " valores positivos");
        System.out.printf("%.1f", media);
    }
}
