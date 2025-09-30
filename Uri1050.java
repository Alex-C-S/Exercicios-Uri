import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe o DDD");
        int ddd = sc.nextInt();
        switch (ddd){
            case 61 :
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("São Paulo");
                break;
            case 21:
                System.out.println("Rio de janeiro");
                break;
            case 32:
                System.out.println("Juiz de fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD não cadastrado");
                break;
        }
    }
}
