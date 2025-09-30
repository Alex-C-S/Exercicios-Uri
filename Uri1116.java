import java.util.Scanner;

public class Uri1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de numeros desejados: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Me informe o primeiro numero");
            int n1 = sc.nextInt();
            System.out.println("Me informe o segundo numero");
            int n2 = sc.nextInt();
            if(n2 == 0){
                System.out.println("IMPOSSIVEL DIVISAO");
            }else{
                double divisao = (double ) n1/n2;
                System.out.println(divisao);
            }
        }
    }
}
