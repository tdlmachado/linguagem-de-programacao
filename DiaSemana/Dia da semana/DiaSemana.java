import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do dia (1-7): ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Dia inválido!");
            return; // para o programa
        }

        String diaNome = switch (dia) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia inválido"; // nunca vai cair aqui por causa do if
        };

        System.out.println(diaNome);
    }
}
