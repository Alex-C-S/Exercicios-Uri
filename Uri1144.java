import java.util.Scanner;

public class Uri1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
            System.out.println(i + " " + (quadrado + 1) + " " + (cubo +1));
        }
    }
}
