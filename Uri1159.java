import java.util.Scanner;

public class Uri1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de X");
        int x = sc.nextInt();
        while (x != 0){
            if( x % 2 != 0){
                x++;
            }
            int soma = 0;
            for(int i = 0; i < 5; i++){
                soma += x;
                x += 2;
            }
            System.out.println(soma);
            System.out.println("Me informe o primeiro numero");
            x = sc.nextInt();
        }
    }
}
