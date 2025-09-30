import java.util.Scanner;

public class Uri1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado");
        int n = sc.nextInt();
        int total  = 1;
        for(int i = n; i >=1; i--){
            total = total * i;

        }
        System.out.println(total);
    }
}
