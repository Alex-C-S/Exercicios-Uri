import java.util.Scanner;

public class Uri1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de valores a ser lido");
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            System.out.println("Digite o numero " + ( i + 1) + " :");
            int x = sc.nextInt();
            if(x % 2 == 0){
                if(x > 0){
                    System.out.println(" EVEN POSITIVE ");
                }else if (x < 0){
                    System.out.println("EVEN NEGATIVE");
                }else{
                    System.out.println("NULL");
                }
            }else if(x % 2 != 0){
                if(x > 0){
                    System.out.println(" ODD POSITIVE ");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
