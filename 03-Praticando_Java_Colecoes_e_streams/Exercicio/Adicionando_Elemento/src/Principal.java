import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> funcionarios = new ArrayList<>();

        String nomeFuncionario;
        String continuar;


        while (true) {
            System.out.println("Digite o nome do funcionário: ");
            nomeFuncionario = entrada.nextLine();

            funcionarios.add(nomeFuncionario);
            System.out.println("Adicionado com sucesso!");

            System.out.println("Deseja adicionar mais algum nome? ");
            continuar = entrada.nextLine();

            if(continuar.equals("S")) {
                continue;
            }else if(continuar.equals("N")){
                System.out.println("Processo finalizado.");
                break;
            }

            // Exibe todos os nomes dos funcionários cadastrados
            System.out.println("\nLista de Funcionários:");
            for (String funcionario : funcionarios) {
                System.out.println(funcionario);
            }

            entrada.close();


        }

    }
}
