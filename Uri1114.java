import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a senha");
        int senha = sc.nextInt();
        while (senha != 2002){
            System.out.println("Senha incorreta");
            System.out.println("Digite novamente");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido ");
    }
}
