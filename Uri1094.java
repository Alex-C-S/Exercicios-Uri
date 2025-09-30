import java.util.Locale;
import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a quantidade de experimentos desejados: ");
        int experimentos = sc.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;
        char cobaia = 0;
        int media = 0;

        for(int i = 1; i <= experimentos; i++){
            System.out.println("Quantos experimentos?");
            int total = sc.nextInt();
            System.out.println("Qual a cobaia");
            cobaia = sc.next().charAt(0);
            if(cobaia == 'C'){
                coelhos+= total;
            }else if(cobaia == 'R'){
                ratos+= total;
            }else{
                sapos+= total;
            }
            media += total;
        }
        System.out.println("Total: " + media + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        double pCoelhos = (coelhos * 100.0) / media;
        double pRatos = (ratos * 100.0) / media;
        double pSapos = (sapos * 100.0) / media;
        System.out.printf("Percentual de coelhos: %.2f %%\n", pCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", pRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", pSapos);
    }
}
