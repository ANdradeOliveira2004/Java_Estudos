package array_list;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Paulo");
        funcionarios.add("Gabi");
        funcionarios.add("Arthur");

        //Utilizando o get
        System.out.println(funcionarios.getFirst()); //Primeiro funcioanario da lista.
        System.out.println(funcionarios.getLast());//Ultimo funcionario da lista.
        System.out.println(funcionarios.get(1));//escolhemos qual funcionario queremos buscar atraves do indice.

        //Utilizando o size
        System.out.println(funcionarios.size());//Exibe o tamanho da lista

        //Utilizando o remove
        funcionarios.remove("Paulo");
        funcionarios.remove("Gabi");
        funcionarios.remove("Arthur");

        System.out.println(funcionarios);


    }
}
