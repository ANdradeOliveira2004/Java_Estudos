package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filters {

    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Paulo");
        funcionarios.add("Carlos");
        funcionarios.add("Diomeneis");
        funcionarios.add("Gabrielle");
        funcionarios.add("Arthur");
        funcionarios.add("Claudia");
        funcionarios.add("Henrique");
        funcionarios.add("Bigode");
        funcionarios.add("Lezita");
        funcionarios.add("gabriell");
        funcionarios.add("Joao");
        funcionarios.add("Paulo");
        funcionarios.add("Luiza");

        //criando outra lista para filtrar'
        List<String> FuncionariosLetraP = funcionarios.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());
        //funcionarios.stream(): cria um stream da lista.
        //.filter(f -> f.startsWith("A")): mantém apenas os nomes que começam com "A".
        // .collect(Collectors.toList()): transforma o resultado de volta em uma List.

        //exibindo
        System.out.println(funcionarios);
        System.out.println(FuncionariosLetraP);

    }

}
