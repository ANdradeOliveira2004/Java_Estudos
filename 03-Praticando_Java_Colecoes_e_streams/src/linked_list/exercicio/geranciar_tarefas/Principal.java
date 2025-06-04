package linked_list.exercicio.geranciar_tarefas;

public class Principal {

    public static void main(String[] args) {
        GerenciarTarefas gerenciador = new GerenciarTarefas();

        gerenciador.adicionarNoInicio("Estudar Java coleções");
        gerenciador.adicionarTarefa("Caminhada");
        gerenciador.adicionarTarefa("Ciclismo");
        gerenciador.adicionarTarefa("Natação");
        gerenciador.adicionarTarefa("Jiu-Jitsu");
        gerenciador.adicionarNoFim("Dar banho no meu filhão");

        gerenciador.listarTarefas();
    }
}
