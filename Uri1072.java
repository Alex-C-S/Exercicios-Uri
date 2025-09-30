import java.util.Scanner;

public class Uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade desejada");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for(int i = 0; i <n ; i++){
            System.out.println("Digite o " + (i+1)+ " valor");
            int valor = sc.nextInt();
            if(valor >= 10 && valor <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
