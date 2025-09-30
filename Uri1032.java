import java.util.Scanner;

public class Uri1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de x");
        int x = sc.nextInt();
        System.out.println("Me informe o valor de y");
        int y = sc.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x,y);
        int soma = 0;
        for(int i = 0; i <= max; i++){
            if(i %13 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
