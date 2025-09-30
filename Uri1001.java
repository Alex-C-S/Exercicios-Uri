import java.util.Scanner;

public class Uri1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor desejado: ");
        int a = scanner.nextInt();
        System.out.println("Me informe o segundo valor desejado: ");
        int b = scanner.nextInt();
        int resultado = a+b;
        System.out.println("X = " + resultado );
    }
}
