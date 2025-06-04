package linked_list.exercicio.editar_item;

import java.util.LinkedList;
import java.util.Objects;

public class EditarLinkeList {
    private LinkedList<String> nomes = new LinkedList<>();

    // Corrigido o nome do metodo
    public void adicionar(String nome) {
        nome = Objects.requireNonNull(nome, "Nome não pode ser nulo!");
        nomes.add(nome);
    }

    public String permitirEscolha(int indice) {
        if (indice < 0 || indice >= nomes.size()) {
            return "Índice inválido!";
        }
        return nomes.get(indice); // índice válido
    }

    public String listarNomes() {
        if (nomes.isEmpty()) {
            return "Lista está vazia!";
        }

        String mensagem = "";
        for (int i = 0; i < nomes.size(); i++ ) {
            mensagem += (i + 1 )  + " - " + nomes.get(i) + "\n";
        }
        return mensagem;
    }
}
