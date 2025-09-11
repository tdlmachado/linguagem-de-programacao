import java.util.Scanner;

public class resultadoIMC {
    public static void main(String[] args) {
        tabelaIMC calc = new tabelaIMC();
        Scanner input = new Scanner(System.in);

        System.out.print("----- Entrada de Dados -----\n");
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double resultado = calc.calculoIMC(peso, altura);

        System.out.print("\n----- Resultado do seu IMC -----\n");
        System.out.printf("IMC = %.2f", resultado);
        System.out.println("\nClassificação = " + tabelaIMC.classificacao(resultado));
    }
}