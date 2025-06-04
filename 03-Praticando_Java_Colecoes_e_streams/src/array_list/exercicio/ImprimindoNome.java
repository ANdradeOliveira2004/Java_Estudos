package array_list.exercicio;

import java.util.*;

public class ImprimindoNome {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nomeUsuario = new ArrayList<>();

        String nome;

        while (true){
            System.out.println("Digite o seu nome de usuário: ");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            nomeUsuario.add(nome);
        }

        //Ordenando a lista em ordem alfabética.
        Collections.sort(nomeUsuario);

        for (String nomess : nomeUsuario) {
            System.out.println("Nomes em ordem albaética: \n " + nomess);
        }

        entrada.close();



    }

}
