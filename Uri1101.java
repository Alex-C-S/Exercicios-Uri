import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de x");
        int x = sc.nextInt();
        System.out.println("Me informe o valor de y");
        int y = sc.nextInt();
        int maior = Math.max(x, y);
        int menor = Math.min(x, y);

        while(x != 0 && y != 0){
            int soma = 0;
            for (int i = menor; i <= maior; i++){
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
            System.out.println("Me informe o valor de x");
            x = sc.nextInt();
            System.out.println("Me informe o valor de y");
            y = sc.nextInt();
        }
    }
}
