import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoProduto = entrada.nextDouble();

        if (precoProduto <= 50) {
            System.out.println("Categoria do produto: Econômico");
        }else if (precoProduto > 50 && precoProduto <= 200) {
            System.out.println("Categoria do produto: Intermediário");
        }else {
            System.out.println("Categoria do produto: Premium");
        }


    }
}
