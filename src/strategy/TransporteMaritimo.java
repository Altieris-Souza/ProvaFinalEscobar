package strategy;

public class TransporteMaritimo implements TransporteStrategy {
    @Override
    public void executarEntrega(String destino, double peso, double dimensao) {
        if (destino.equals("internacional")) {
            System.out.println("Realizando entrega marítima internacional.");
            System.out.println("Entrega permitida para destinos internacionais.");
        } else {
            System.out.println("Entrega marítima disponível apenas para destinos internacionais.");
        }
    }
}
