import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite  valor A");
        int nA = sc.nextInt();
        System.out.println("Digite valor B");
        int nB = sc.nextInt();
        System.out.println("Digite valor C  ");
        int nC = sc.nextInt();
        System.out.println("Digite  valor D");
        int nD = sc.nextInt();

        int somaCD = nC + nD;
        int somaAB = nA + nB;
        if((nB > nC) && (nD > nA) && (somaCD > somaAB) && (nC > 0) && (nD > 0) && (nA % 2 == 0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores não aceitos");
        }
    }
}
