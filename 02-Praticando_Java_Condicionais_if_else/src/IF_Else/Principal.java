package IF_Else;

public class Principal {

    public static void main(String[] args) {

        String nome = "Paulo";
        double valorImposto = 2500.0;
        double salario = 1800.0;
        int numeroDepositantes = 2;

        if (salario > valorImposto) {
            double impostoRenda = salario / 100 * 7.5;
            System.out.println(nome + "Você tem que Pagar de Imposto: " + impostoRenda);
        }else {
            System.out.println("Você não precisa pagar imposto.");
        }
    }

}
