package strategy;

public class TransporteAereo implements TransporteStrategy {
    @Override
    public void executarEntrega(String destino, double peso, double dimensao) {
        if (peso <= 100 && dimensao <= 50) {
            System.out.println("Realizando entrega aérea para " + destino + ".");
            System.out.println("Limite de peso e dimensões atendidos.");
        } else {
            System.out.println("Entrega aérea não disponível. Peso ou dimensões excedem os limites.");
        }
    }
}
