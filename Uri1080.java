import java.util.Scanner;

public class Uri1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores deseajados");
        int n = sc.nextInt();
        int x = 0;
        int maior = 0;
        int posicao = 0;
        for(int i = 1; i <=n; i++){
            x = sc.nextInt();
            if(x > maior){
                maior = x;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
