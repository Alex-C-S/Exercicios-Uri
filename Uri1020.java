import java.util.Locale;
import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me infome a idade de uma pessoa em dias: ");
        int idade = sc.nextInt();
        int anos = idade / 364;
        idade = idade % 364;
        int mes = idade / 31;
        idade = idade % 31;
        int dia = idade / 1;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(s)");
        System.out.println(dia + " dias(s)");

    }
}
