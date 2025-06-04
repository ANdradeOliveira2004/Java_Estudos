package array_list.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscandoNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        numeros.add(55);
        numeros.add(30);
        numeros.add(200);
        numeros.add(150);
        numeros.add(0);

        System.out.println("Digite um número: ");
        int numeroUsuario = entrada.nextInt();

        if (numeros.contains(numeroUsuario)) {
            System.out.println("Número " + numeroUsuario + ", foi encontrado na lista.");
        } else {
            System.out.println("Número " + numeroUsuario + ", não foi encontrado em nossa lista.");
        }

        entrada.close(); //fechando o scanner.


    }

}
