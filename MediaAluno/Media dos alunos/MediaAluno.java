import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da quantidade de alunos
        System.out.println("\t\t--- Alunos --- ");
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();

        // Entrada da quantidade de notas
        System.out.println("\n\t\t--- NOTAS ---");
        System.out.print("Digite a quantidade de notas: ");
        int n = sc.nextInt();

        // Declaração de variáveis
        double[] notas = new double[n];
        double[] pesos = new double[n];
        double[] media = new double[qtdAlunos];

        // Escolha do tipo de média
        System.out.println("\n\t\t--- Tipo de Media --- ");
        System.out.print("Digite 1 para média simples ou 2 para média ponderada: ");
        int tipo = sc.nextInt();
        if (tipo != 1 && tipo != 2) {
            System.out.println("\n*Modelo de média inválido*");
            System.exit(0);
        }
        System.out.println(" ");
        // Loop para cada aluno
        for (int q = 0; q < qtdAlunos; q++) {

            // Reinicia toda vez que entra no laço
            double somaNotas = 0;
            double somaPesos = 0;

            // Leitura das notas e pesos (se ponderada)
            for (int i = 0; i < n; i++) {
                System.out.print("Digite a nota do aluno " + (q + 1) + " na " + (i + 1) + "° prova: ");
                notas[i] = sc.nextDouble();

                if (tipo == 2) {  // Média ponderada
                    System.out.print("Digite o peso da nota " + (i + 1) + ": ");
                    pesos[i] = sc.nextDouble();
                }
            }
            System.out.println(" ");
            // Cálculo da média
            if (tipo == 1) { // Média simples
                for (int i = 0; i < n; i++) {
                    somaNotas += notas[i];
                }
                media[q] = somaNotas / n;
            } else { // Média ponderada
                for (int i = 0; i < n; i++) {
                    somaNotas += notas[i] * pesos[i];
                    somaPesos += pesos[i];
                }
                media[q] = somaNotas / somaPesos;
            }
        }

        // Exibe resultados e classificação
        System.out.println("\n\t-----RESULTADOS -----");
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.printf("Aluno %d - Média: %.2f - ", (i + 1), media[i]);
            if (media[i] >= 7.0) {
                System.out.println("APROVADO");
            } else if (media[i] >= 3.0) {
                System.out.println("EXAME");
            } else {
                System.out.println("REPROVADO");
            }
        }
        sc.close(); // Fecha a classe scanner
    }
}