import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        metodos calc = new metodos();

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("-- Operadores matemáticos --");
        System.out.println("[1] para + ");
        System.out.println("[2] para - ");
        System.out.println("[3] para * ");
        System.out.println("[4] para / ");
        System.out.println("----------------------------");

        System.out.println("Digite a operação matematica: ");
        int operador = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        switch (operador) {
            case 1:
                System.out.println("Resultado: " + calc.somar(n1, n2));
                break;
            case 2:
                System.out.println("Resultado: " + calc.subtrair(n1, n2));
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicar(n1, n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Resultado: " + calc.dividir((int) n1, n2));
                }
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }
    }
}