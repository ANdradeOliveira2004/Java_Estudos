public class Main {
    public static void main(String[] args) {
        double consumoMedio = 8.5; // faz 8km por litro
        double capacidadeTanque = 50; // O tanque comporta 50 Litros
        double combustivelAtual = 30; // Possue 30 Litros no tanque
        double distanciaViagem = 300; // Viagem de SP até Leme

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia maxima do veiculo: " + autonomiaMaxima + " Km");
        System.out.println("Autonomia atual: " + autonomiaAtual + " Km");

        if (autonomiaAtual < distanciaViagem) {
            System.out.println("Você precisa abastecer o carro.");
        }else {
            System.out.println("Você pode completar a viagem sem precisar abastecer.");
        }
    }
}
