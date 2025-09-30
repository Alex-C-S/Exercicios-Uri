import java.util.Scanner;

public class Uri1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado");
        int n = sc.nextInt();
        int contato = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(contato + " ");
                contato++;
                }
            contato++;
            System.out.println("PUM");
            }
        }
    }

