import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double taxaCambio = 5.00;

        System.out.println("Digite o valor em (USD) ");
        double precoUSD = entrada.nextDouble();

        double precoBRL = precoUSD * taxaCambio;

        System.out.println("O valor em USD é: " + precoUSD + " Preço em BRL: " + precoBRL);

        entrada.close(); //Lembrar sempre de fechar o Scanner

    }
}
