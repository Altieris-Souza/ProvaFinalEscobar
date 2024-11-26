package strategy;

public class TransporteFactory {
    public static TransporteStrategy obterTransporte(String tipo, String destino, double peso, double dimensao) {
        if (tipo.equalsIgnoreCase("terrestre")) {
            return new TransporteTerrestre();
        } else if (tipo.equalsIgnoreCase("aereo")) {
            return new TransporteAereo();
        } else if (tipo.equalsIgnoreCase("maritimo")) {
            return new TransporteMaritimo();
        } else if (tipo.equalsIgnoreCase("drone")) {
            return new TransporteDrone();
        } else {
            throw new IllegalArgumentException("Tipo de transporte desconhecido");
        }
    }
}