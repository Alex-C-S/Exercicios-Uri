import java.util.Scanner;

public class Uri1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o primeiro valor inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Me informe o segundo valor inteiro: ");
        int n2 = sc.nextInt();
        if(n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São multiplicos");
        }else{
            System.out.println("Não sao multiplicos");
        }
    }
}
