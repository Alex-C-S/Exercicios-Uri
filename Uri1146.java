import java.util.Scanner;

public class Uri1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de x");
        int x = sc.nextInt();
       while(x != 0){
           for(int i = 1; i<=x;i++){
               System.out.println(i);
           }
           System.out.println("Informe o proximo numero");
            x = sc.nextInt();
       }
    }
}
