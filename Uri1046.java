import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Me informe a hora final do jogo: ");
        int horaFinal = sc.nextInt();
        int tempo = 0;
        if(horaInicial >= horaFinal){
            tempo = ((horaInicial - 24) * -1)  + horaFinal ;
        }else{
            tempo = (horaFinal - horaInicial);
        }

        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    }
}
