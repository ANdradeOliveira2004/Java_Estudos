import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Título do Livro: ");
        String titulo = entrada.nextLine();

        System.out.println("Digite o Autor do Livro: ");
        String autor = entrada.nextLine();

        System.out.println("Digite o Número de páginas do livro: ");
        int numeroPaginas = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o preço do livro: ");
        int  precoLivro = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Categoria do livro: \nF - (Ficção) \nN - (Não Ficção) \nT - (Tecnologia) \nH - (História)");
        char categoriaLivro = entrada.nextLine().charAt(0);// Lê apenas um caractere digitado pelo usuário.
        categoriaLivro = Character.toUpperCase(categoriaLivro);// Transformando a letra que o usuário digitar sempre em Maiuscula.

        System.out.println("Livro cadastrado: " + titulo + " de " + autor + ". Ele possui " + numeroPaginas + " páginas, " + " custa R$" + precoLivro + " é pertencem á categoria " + categoriaLivro);
    }


}
