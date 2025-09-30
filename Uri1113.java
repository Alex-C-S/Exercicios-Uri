import java.util.Scanner;

public class Uri1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0; int y = 1;
        while(x!= y){
            System.out.println("Me informe o valor de X");
            x = sc.nextInt();
            System.out.println("Me informe o valor de Y");
            y = sc.nextInt();
            if(x > y){
                System.out.println("Decrecente");
            }else{
                System.out.println("Crescente");
            }
        }

    }
}
