import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o numero: ");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            numero ++;
        }
        for(int i = 0; i < 6; i++){
            System.out.println(numero);
            numero += 2;
        }
    }
}
