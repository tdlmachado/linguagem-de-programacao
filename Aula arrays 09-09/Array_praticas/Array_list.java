import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("joao");
        nomes.add("Mario");
        nomes.add("Maria");
        nomes.add(1,"thiago");

        // Substitui o nome da posição 0 para Juan
        nomes.set(0,("Juan"));

        // Remove o nome da posição
        //nomes.remove(1);

        // A variavel nome puxa o valor da posição 2 da array nomes
        String nome = nomes.get(2);

        boolean existe = nome.contains("thiago");

        if (existe){
            nomes.clear();
        }

        System.out.println("Nomes digitados: " + nomes);

        for(int i=0;i<nomes.size();i++){
            System.out.printf("%d° Nome da lista: %s \n",i+1 ,nomes.get(i));
        }

        System.out.printf("O tamanho da lista é: %s \n", nomes.size());
        System.out.println(nome);
    }
}
