import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor:");
        int n1 = sc.nextInt();
        System.out.println("Me informe o segundo valor: ");
        int n2 = sc.nextInt();
        System.out.println("Me informe o terceiro valor: ");
        int n3 = sc.nextInt();
        int [] ordem = {n1, n2, n3};
        Arrays.sort(ordem);
        for( int num : ordem){
            System.out.println(num);
        }
        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
