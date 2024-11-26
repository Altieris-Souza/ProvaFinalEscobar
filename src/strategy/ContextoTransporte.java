package strategy;

public class ContextoTransporte {
    private TransporteStrategy transporteStrategy;
    
	public ContextoTransporte(TransporteStrategy transporteStrategy) {
		this.transporteStrategy = transporteStrategy;
	}    

    public void setTransporteStrategy(TransporteStrategy transporteStrategy) {
        this.transporteStrategy = transporteStrategy;
    }

    public void executarEntrega(String destino, double peso, double dimensao) {
        transporteStrategy.executarEntrega(destino, peso, dimensao);
    }
}
