import java.util.Scanner;

public class Aula_basica  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int qtd_alunos = input.nextInt();
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        double media = 0;

        for (int i = 1; i <= qtd_alunos; i++) {
            media += idade;
        }
        System.out.print("Media de idade" +media);

    }
}