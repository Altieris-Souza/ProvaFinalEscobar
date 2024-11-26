package strategy;

public class TransporteDrone implements TransporteStrategy {
    @Override
    public void executarEntrega(String destino, double peso, double dimensao) {
        if (destino.equals("metropolitana") && peso <= 5 && dimensao <= 10) {
            System.out.println("Realizando entrega por drone para área metropolitana.");
            System.out.println("Limite de peso e dimensões atendidos.");
        } else {
            System.out.println("Entrega por drone não disponível. Verifique a área ou as especificações.");
        }
    }
}
