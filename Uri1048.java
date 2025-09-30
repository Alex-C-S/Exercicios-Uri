import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o seu salario");
        double salario = sc.nextDouble();
        double percentual = 0.0;
        double percentualNovo = 0.0;

        if(salario <= 400.0){
            percentual = 15;
            percentualNovo = salario * 0.15;
        }else if(salario <= 800.0){
            percentual = 12;
            percentualNovo  = salario * 0.12;
        }else if (salario <= 1200.00){
            percentual = 10;
            percentualNovo  = salario * 0.10;
        }else if(salario <= 2000.00){
            percentual = 7;
            percentualNovo  = salario * 0.07;
        }else{
            percentual = 4;
            percentualNovo  = salario * 0.04;
        }
        double reajuste = (salario - salario) + percentualNovo ;
        double novoSalario = salario + percentualNovo;
        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%", novoSalario, reajuste, percentual);
    }
}
