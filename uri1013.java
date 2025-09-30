import java.util.Locale;
import java.util.Scanner;

public class uri1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Me informe o segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Me informe o terceiro valor: ");
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println(a + " eh o maior");
        }else if(b > a && b > c){
            System.out.println(b + " eh o maior");
        }else{
            System.out.println(c + " eh o maior");
        }
    }
}
