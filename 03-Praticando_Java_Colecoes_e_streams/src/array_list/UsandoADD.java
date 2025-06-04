package array_list;

import java.util.ArrayList;
import java.util.List;

public class UsandoADD {

    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        //adicionando funcionarios
        funcionarios.add("Paulo");
        funcionarios.add("Gabi");
        funcionarios.add("Arthur");

        //Imprimindo lista de funcionarios
        System.out.println(funcionarios);

        for (String f : funcionarios) {
            System.out.println(f);
        }
    }
}
