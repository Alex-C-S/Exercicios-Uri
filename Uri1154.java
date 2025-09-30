import java.lang.foreign.SymbolLookup;
import java.util.Locale;
import java.util.Scanner;

public class Uri1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a idade");
        double idade = sc.nextDouble();
        double soma = 0.0;
        double quantidade = 0.0;
        while( idade >= 0){
            soma = soma + idade;
            quantidade ++;
            System.out.println("Me informe a idade");
            idade = sc.nextDouble();
        }
        double total =(double) soma / quantidade;
        System.out.printf("%.2f", total);
    }
}
