import java.util.Scanner;

public class Uri1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de testes necessario");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Me informe o valor de X");
            int x = sc.nextInt();
            System.out.println("Me informe o valor de Y");
            int y = sc.nextInt();
           if(x % 2 ==0){
               x++;
           }
           int soma = 0;
           for(int j = 0; j < y;j++){
               soma += x;
               x += 2;
           }
            System.out.println(soma);
        }
    }
}
