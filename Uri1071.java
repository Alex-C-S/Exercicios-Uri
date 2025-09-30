import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de x");
        int x = sc.nextInt();
        System.out.println("Me informe o valor de y");
        int y = sc.nextInt();
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);
        int soma = 0;
        for(int i = menor + 1; i < maior; i ++){
            if(i % 2 != 0){
                soma = soma + i;
            }
            System.out.println(i);
        }
        System.out.println(soma);
    }
}
