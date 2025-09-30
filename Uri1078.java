import java.util.Scanner;

public class Uri1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero desejado");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int tabuada = n * i;
            System.out.println(i + " x " + n + " = " + tabuada);
            }
        }
    }

