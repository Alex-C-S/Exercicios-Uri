import java.util.Locale;
import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Me informe o minuto inicial do jogo: ");
        int minutoInicial = sc.nextInt();
        System.out.println("Me informe a hora finald o jogo: ");
        int horaFinal = sc.nextInt();
        System.out.println("Me informe o minuto final do jogo: ");
        int minutoFinal = sc.nextInt();

        int inicioTotal = horaInicial * 60 + minutoInicial;
        int finalTotal = horaFinal * 60 + minutoFinal;
        if(finalTotal <= inicioTotal){
            finalTotal += 24 * 60;
        }
        int duracao = finalTotal - inicioTotal;
        int horas = duracao/ 60;
        int minutos = duracao % 60;
        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}
