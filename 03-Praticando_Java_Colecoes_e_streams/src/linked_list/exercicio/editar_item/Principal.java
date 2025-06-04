package linked_list.exercicio.editar_item;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        EditarLinkeList editar = new EditarLinkeList();

        while (true) {
            System.out.print("Digite o nome que deseja adicionar: ");
            String nome = entrada.nextLine();

            editar.adicionar(nome);

            System.out.print("Deseja adicionar outro nome? (S/N): ");
            String resposta = entrada.nextLine();

            //Quando queremos que o código sejá encerrado devemos colocá-la dentro de um ‘loop’.
            if ("N".equalsIgnoreCase(resposta)) {
                break;
            }
        }

        System.out.println("\nListando nomes:");
        System.out.println(editar.listarNomes());


        entrada.close();
    }

    public void buscandoNomeIndice(EditarLinkeList editarIndice) {
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o nome que deseja buscar: ");
        int indice = entrada2.nextInt();
        entrada2.nextLine();

        String buscarNome = editarIndice.permitirEscolha(indice);

        //Verfica se o objeto e null
        Objects.requireNonNull(buscarNome, "Índice inválido! Nome não encontrado.");

        System.out.println("Nome da lista: " + buscarNome);
    }


}
