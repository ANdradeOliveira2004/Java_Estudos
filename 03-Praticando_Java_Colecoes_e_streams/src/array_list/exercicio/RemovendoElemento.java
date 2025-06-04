package array_list.exercicio;

import java.util.*;

public class RemovendoElemento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeroRepetido = new ArrayList<>();

        System.out.println("Digite números. Após 10 inserções, será perguntado se deseja encerrar.");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();
            numeroRepetido.add(numero);

            // Após 10 inserções, permitir encerramento
            if (numeroRepetido.size() >= 10) {
                entrada.nextLine(); // consumir quebra de linha do nextInt
                System.out.print("Deseja encerrar? (S para sim, qualquer tecla para continuar): ");
                String fim = entrada.nextLine();

                if (fim.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }

        // Usar LinkedHashSet para manter a ordem de inserção
        Set<Integer> numerosNaoDuplicados = new LinkedHashSet<>(numeroRepetido);

        System.out.println("\nNúmeros sem duplicatas:");
        for (Integer n : numerosNaoDuplicados) {
            System.out.println(n);
        }

        entrada.close();
    }
}
