package strategy;

public class TransporteTerrestre implements TransporteStrategy {
    @Override
    public void executarEntrega(String destino, double peso, double dimensao) {
        System.out.println("Realizando entrega terrestre para " + destino + ".");
        System.out.println("Transportadora local selecionada.");
    }
}