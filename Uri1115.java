import java.util.Scanner;

public class Uri1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a coordenada X");
        int x = sc.nextInt();
        System.out.println("Me informe a coordenada Y");
        int y = sc.nextInt();
        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(y > 0 && x < 0){
                System.out.println("Segundo");
            }else if(x< 0 && y < 0){
                System.out.println("terceiro");
            }else{
                System.out.println("quarto");
            }
            System.out.println("Me informe a coordenada X");
            x = sc.nextInt();
            System.out.println("Me informe a coordenada Y");
            y = sc.nextInt();
        }
    }
}
