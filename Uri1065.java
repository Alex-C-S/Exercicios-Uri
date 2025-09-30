import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Me informe o valor " + ( i +1));
            int numero = sc.nextInt();
            if(numero % 2 == 0){
                total++;
            }
        }
        System.out.println(total + " valores pares");
    }
}
