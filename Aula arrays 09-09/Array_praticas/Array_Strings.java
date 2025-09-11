public class Array_Strings {
    public static void main(String[] args) {

        // Array para armazenar os nomes
        String[] nomes = {"Ana","João","Maria", "thiago"};
        System.out.printf("----- Nomes -----\n");

        /*for (String nome : nomes) {
            System.out.println("Nome " + nome);
        }*/

        // Imprime os nomes
        for(int i=0; i<nomes.length; i++){
            System.out.printf("%d°Nome %s\n",i+1, nomes[i]);
        }

        // Mostra a quantidade de nomes de forma isolada
        System.out.println(String.valueOf(nomes.length));

        // Mostra a quantidade de nomes dentro de um print com texto
        System.out.printf("-----------------\n");
        System.out.printf("A quantidade total de nomes é: " + nomes.length);
        System.out.printf("\n-----------------");
    }
}
