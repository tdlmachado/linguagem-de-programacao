import java.util.ArrayList;

public class Array_list_professor {
    public static void main(String[] args) {
        // 1. O que é ArrayList?
        // ArrayList é uma classe da coleção Java que implementa a interface List.
        // É uma lista dinâmica que pode crescer ou diminuir de tamanho conforme necessário,
        // ao contrário de arrays tradicionais que têm tamanho fixo.

        // 2. Criando um ArrayList
        // Sintaxe: ArrayList<Tipo> nomeDaLista = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        // 3. Adicionando elementos
        // O método add() insere elementos no final da lista ou em um índice específico
        nomes.add("Alice"); // Adiciona "Alice" ao final
        nomes.add("Bob");   // Adiciona "Bob" ao final
        nomes.add(1, "Carol"); // Adiciona "Carol" na posição de índice 1
        System.out.println("Após adicionar elementos: " + nomes); // [Alice, Carol, Bob]

        // 4. Acessando elementos
        // O método get() retorna o elemento em um índice específico
        String nome = nomes.get(0); // Acessa o elemento no índice 0
        System.out.println("Elemento no índice 0: " + nome); // Alice

        // 5. Alterando elementos
        // O método set() substitui o elemento em um índice específico
        nomes.set(1, "David"); // Substitui "Carol" por "David"
        System.out.println("Após alterar elemento: " + nomes); // [Alice, David, Bob]

        // 6. Removendo elementos
        // O método remove() pode remover por índice ou por objeto
        nomes.remove(2); // Remove o elemento no índice 2 (Bob)
        nomes.remove("Alice"); // Remove o elemento "Alice"
        System.out.println("Após remover elementos: " + nomes); // [David]

        // 7. Verificando o tamanho
        // O método size() retorna o número de elementos na lista
        System.out.println("Tamanho da lista: " + nomes.size()); // 1

        // 8. Verificando se contém um elemento
        // O método contains() verifica se um elemento está na lista
        boolean contemDavid = nomes.contains("David");
        System.out.println("Contém David? " + contemDavid); // true

        // 9. Iterando sobre o ArrayList
        // Usando um loop for-each para percorrer a lista
        System.out.println("Iterando sobre a lista:");
        for (String n : nomes) {
            System.out.println(n);
        }

        // 10. Limpando a lista
        // O método clear() remove todos os elementos
        nomes.clear();
        System.out.println("Após limpar a lista: " + nomes); // []

        // 11. Verificando se a lista está vazia
        // O método isEmpty() retorna true se a lista não tiver elementos
        System.out.println("A lista está vazia? " + nomes.isEmpty()); // true

        // Exemplo prático: Gerenciando uma lista de tarefas
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler documentação");

        // Exibindo tarefas pendentes
        System.out.println("\nLista de tarefas pendentes:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        // Marcando a primeira tarefa como concluída (removendo)
        tarefas.remove(0);
        System.out.println("Tarefas após concluir a primeira: " + tarefas);
    }
}