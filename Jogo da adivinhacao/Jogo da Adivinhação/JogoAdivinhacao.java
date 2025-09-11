import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero = random.nextInt(10) + 1;
        int tentativas = 6;
        boolean Acertou = false;

        System.out.println("Bem vindo ao Jogo da Adivinhacao!");
        System.out.println("Tente adivinhar o número entre 1 e 10. Você tem " + tentativas + " tentativas.");

        while (tentativas > 0 && !Acertou) {
            System.out.print("\nDigite seu chute: ");
            int chute = scanner.nextInt();

            if (chute == numero) {
                System.out.println("\n-----------------------------");
                System.out.println("Parabéns! Você acertou o numero");
                System.out.println("-----------------------------");

                Acertou = true;
            }else{
                tentativas--;
                if(tentativas > 0 ){
                    // Condicional para Dica
                    if(chute > numero){
                        System.out.println("O número é menor que " + chute );
                    }else  if(chute < numero){
                        System.out.println("O número é maior que " + chute );
                    }
                }
            }
        }
    }
}