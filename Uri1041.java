import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor:");
        double n1 = sc.nextDouble();
        System.out.println("Me informe o segundo valor:");
        double n2 = sc.nextDouble();

        if(n1 > 0 && n2 > 0){
            System.out.println("Q1");
        }else if (n1 > 0 && n2 < 0){
            System.out.println("Q4");
        }else if(n1 < 0 && n2 > 0){
            System.out.println("Q2");
        }else if(n1 < 0 && n2 < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Origem");
        }
    }
}
