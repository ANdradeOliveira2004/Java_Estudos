package linked_list;

import java.util.HashSet;
import java.util.Set;

public class UsandoSet {

    public static void main(String[] args) {
        //Criando produto utilizando o (Set).

        //HashSet é a classe que implementa o (SET) é o mais rapido também
        Set<String> produtos = new HashSet<>();

        //Adicionando produto.
        //Lembrando que não podemos duplicar.
        produtos.add("Água");
        produtos.add("Coca-Cola");

        System.out.println(produtos);



    }
}
