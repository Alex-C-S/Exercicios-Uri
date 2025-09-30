import java.util.Scanner;

public class Uri1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado");
        int n = sc.nextInt();
        int contato = 1;
        for(int i = 1; i <=n; i++){
            System.out.printf("%d %d %d %n", contato, contato*i, contato*i*i);
            contato++;
        }
    }
}
