import java.util.Scanner;

public class Uri1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        int grenais = 1;
        int empate = 0;
        int InterVenceu = 0;
        int GremioVenceu = 0;
        while(opcao != 2){
            System.out.println("Digite os gols do Inter");
            int inter = sc.nextInt();
            System.out.println("Digite os gols do Gremio");
            int gremio = sc.nextInt();
            grenais++;
            if(inter == gremio){
                empate = empate + 1;
            }
            if(inter > gremio){
                InterVenceu++;
            }else if(inter < gremio){
                GremioVenceu++;
            }else{
                empate++;
            }
            System.out.println("Novo grenal? (1-sim 2-não)");
            opcao = sc.nextInt();
            while(opcao != 1 && opcao != 2){
                System.out.println("Novo grenal? (1-sim 2-não");
                opcao = sc.nextInt();
            }
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + InterVenceu);
        System.out.println("Gremio:" + GremioVenceu);
        System.out.println("Empates:" + empate);
        if(InterVenceu > GremioVenceu){
            System.out.println("Inter venceu mais");
        }else if(InterVenceu < GremioVenceu){
            System.out.println("Gremio venceu mais");
        }else{
            System.out.println("Empate ");
        }
    }
}
