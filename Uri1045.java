import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o valor de A");
        double n1 = sc.nextDouble();
        System.out.println("Me informe o valor de B");
        double n2 = sc.nextDouble();
        System.out.println("Me informe o valor de C");
        double n3 = sc.nextDouble();
        double A, B, C;
        if(n1 >= n2 && n1 >= n3){
            A = n1;
            if(n2 >= n3){
                B = n2;
                C = n3;
            }else{
                B = n3;
                C = n2;
            }
        }else if(n2 >= n1 && n2 >= n3){
            A = n2;
            if(n1 >= n3){
                B = n1;
                C = n3;
            }else{
                B = n3;
                C = n1;
            }
        }else{
            A = n3;
            if( n1 >= n2){
                B = n1;
                C  = n2;
            }else{
                B = n2;
                C = n1;
            }
        }
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Se chegou aqui, é um triângulo válido.

            // Pré-cálculo dos quadrados
            double a2 = Math.pow(A, 2);
            double bc2 = Math.pow(B, 2) + Math.pow(C, 2);

            // SEGUNDO CHECK: Classificação quanto aos ângulos
            if (a2 > bc2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc2) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }

            // TERCEIRO CHECK: Classificação quanto aos lados
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        }
    }

