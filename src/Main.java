import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int adivinhar;
        int tentativas = 0;
        int numeroaleatorio = r.nextInt(1 ,101);

        System.out.println("------------------------------");
        System.out.println("JOGO DE ADIVINHAÇÃO DE NÚMERO");
        System.out.println("------------------------------");

        System.out.println("ADIVINHE UM NÚMERO ENTRE 1-100: ");


        do {
            System.out.println("TENTE UM NÚMERO :");
            adivinhar = sc.nextInt();
            tentativas++;


            if (adivinhar < numeroaleatorio){
                System.out.println("VOCÊ ESTA CHUTANDO MUITO BAIXO..."); }

            else if (adivinhar > numeroaleatorio){
                System.out.println("VOCÊ ESTA CHUTANDO MUITO ALTO...");
            }
            else {
                System.out.println("PARABENS! O NÚMERO ESTA CORRETO ERA " + numeroaleatorio);
                System.out.println("VOCÊ ACERTOU EM " +tentativas + "TENTATIVAS!");

            }
        }while(adivinhar != numeroaleatorio);


    }
}
