import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 17;
        String mensagem;


        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);

        //Aqui o código esta usando o (sout) para exibir as infomações.
        //Porém dentro do nosso if atribuimos uma mensagem, criando uma variavel que armazena dentro dela uma mensagem.
        // Por fim utilizamos o System.out.println => para exibir o resultado.
    }
}
