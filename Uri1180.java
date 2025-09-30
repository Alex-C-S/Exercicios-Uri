import java.util.Scanner;

public class Uri1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de numeros deseajados");
        int n = sc.nextInt();
        int [] numeros = new int[n];
        for(int i = 0; i < n;i++){
            numeros[i] = sc.nextInt();
        }
        int menor = numeros[0];
        int posicao = 0;
        for(int i = 1; i< n; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}

