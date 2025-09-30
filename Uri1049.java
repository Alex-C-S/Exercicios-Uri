import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a primeira palavra");
        String primeiraPalavra = sc.nextLine();
        System.out.println("Me informe a segunda palavra: ");
        String segundaPalavra = sc.nextLine();
        System.out.println("Me informe a terceira palavra: ");
        String terceirapalavra = sc.nextLine();

        if (primeiraPalavra.equals("vertebrado")) {
            if (segundaPalavra.equals("ave")) {
                if (terceirapalavra.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (terceirapalavra.equals("onivoro") ) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }

            }
        } else {
            if (segundaPalavra.equals("inseto")) {
                if (terceirapalavra.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (terceirapalavra.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
