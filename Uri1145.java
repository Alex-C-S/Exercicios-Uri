import java.util.Scanner;

public class Uri1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor");
        int n = sc.nextInt();
        System.out.println("Me informe o segundo valor");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            if (i % n == 0) {
                System.out.println(i); // último da linha
            } else {
                System.out.print(i + " "); // ainda na mesma linha
            }
            }
        }
    }
