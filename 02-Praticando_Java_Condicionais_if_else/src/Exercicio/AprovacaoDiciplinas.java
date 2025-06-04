package Exercicio;

public class AprovacaoDiciplinas {

    public static void main(String[] args) {
        String nome = "Paulo";
        int notaDois = 3;
        int notaUm = 3;

        String mensagem;

        int mediaFinal = (notaUm + notaDois) / 2;

        if (mediaFinal >= 7) {
            mensagem = "O aluno " + nome + " foi aprovado.";
        } else if (mediaFinal > 5.0 && mediaFinal < 6.9) {
            mensagem = "O aluno " + nome + " está de recuperação.";
        } else {
            mensagem = "O aluno  " + nome + " foi reprovado.";
        }

        System.out.println(mensagem);


        /*Porém, em projetos maiores, o padrão mais profissional é separar lógica e exibição, como no exemplo 1
        */

    }
}

