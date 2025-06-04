package linked_list.exercicio.geranciar_tarefas;

import java.util.LinkedList;

//Devemos evitar utilizar as variáveis globais (static)

public class GerenciarTarefas {
    private LinkedList<String> tarefas = new LinkedList<>();

    //Posso inicializar tanto no construtor quanto na declaração diretamente.

//    public GerenciarTarefas() {
//        this.tarefas = new LinkedList<>();
//    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    public void adicionarNoInicio(String tarefa) {
        tarefas.addFirst(tarefa);
    }

    public void adicionarNoFim(String tarefa) {
        tarefas.addLast(tarefa);
    }

    public void listarTarefas() {
        System.out.println("Minha Lista de Tarefas:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }
    }
}
