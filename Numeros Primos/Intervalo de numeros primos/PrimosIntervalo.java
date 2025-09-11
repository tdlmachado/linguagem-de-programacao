import java.util.Scanner;

public class PrimosIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos limites do intervalo
        System.out.print("Digite o limite inferior do intervalo: ");
        int li = sc.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        int ls = sc.nextInt();

        System.out.println("\nNúmeros primos no intervalo de " + li + " até " + ls + ":");

        // For para o intervalo de numeros
        for (int num = li; num <= ls; num++) {
            boolean Primo = true;

            // verifica se o número é primo
            if (num <= 1) {
                Primo = false; // se for menor ou igual a um não é primo
            } else {
                // testa os divisores
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        Primo = false;
                        break;
                    }
                }
            }

            // Se a o valor for verdadeiro ele imprime, caso contrário
            if (Primo) {
                System.out.print(num + " ");
            }
        }
    }
}
