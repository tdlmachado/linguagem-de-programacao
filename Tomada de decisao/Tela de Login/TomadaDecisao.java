import java.util.Scanner;

public class TomadaDecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String usuario_correto = "admin";
        int senha_correta = 1234;
        int tentativa = 1;

        for (tentativa = 1; tentativa<=3;tentativa++) {
            // Entrada de dados
            System.out.println("\n--------------------");
            System.out.print("Digite o seu usuario:");
            String usuario = sc.next();

            System.out.print("Digite sua senha:");
            int senha = sc.nextInt();

            // Verifica se esta compativel com o login definido
            if (usuario.equals(usuario_correto) && senha== senha_correta) {
                System.out.println("\nLogin Bem-sucedido!");
                break;
            }else {
                System.out.print("\nLogin Nao-sucedido!\n");
            }
        }
        if (tentativa == 4){
            System.out.println("\n-----------------");
            System.out.println("\nUsuário bloqueado!");
            System.out.println("\n-----------------");
        }

    }
}