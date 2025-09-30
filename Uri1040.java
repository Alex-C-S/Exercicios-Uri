import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a primeira media ");
        double n1 = sc.nextDouble();
        System.out.println("Me informe a segunda media ");
        double n2 = sc.nextDouble();
        System.out.println("Me informe a terceira media ");
        double n3 = sc.nextDouble();
        System.out.println("Me informe a quarta media ");
        double n4 = sc.nextDouble();
        double media = (n1 * 2.0 + n2 * 3.0 + n3 * 4.0 + n4 * 1.0) / (2.0 + 3.0 + 4.0 + 1.0);
        if(media >= 7.0){
            System.out.printf("Média: %.1f%nAluno aprovado", media);
        }else if(media <= 5.0){
            System.out.printf("Média: %.1f%nAluno reprovado", media);
        }else{
            System.out.println("Me informe a nota do exame: ");
            double exame = sc.nextDouble();
            double exameFinal = (media + exame )/ 2;
            if(exameFinal >= 5.0){
                System.out.printf("Média: %.1f%nAluno em exame%nNota do exame: %.1f%nAluno aprovado%nMedia final: %.1f", media, exame, exameFinal);
            }else{
                System.out.printf("Média: %.1f%nAluno em exame%nNota do exame: %.1f%nAluno reprovado%nMedia final: %.1f", media, exame, exameFinal);
            }
        }
    }
}
