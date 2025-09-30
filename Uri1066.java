import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos =0;
        for(int i = 0; i < 5; i++){
            System.out.println("Me informe o numero " + ( i + 1));
            int numero = sc.nextInt();
            if(numero > 0){
                positivos++;
                if(numero % 2 ==0 ){
                    pares++;
                }else{
                    impares++;
                }
            }else if(numero <= 0){
                negativos++;
                if(numero % 2 ==0 ){
                    pares++;
                }else{
                    impares++;
                }
            }else{
                pares++;
            }
        }
        System.out.println(pares + " valor(res) par(es)");
        System.out.println(impares + " valor(res) impar(res");
        System.out.println(positivos + " valor(res) positivo(s");
        System.out.println(negativos + " valo(res) negativo(s)");
    }
}
