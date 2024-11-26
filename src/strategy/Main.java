package strategy;

public class Main {
	  public static void main(String[] args) {
	        ContextoTransporte contexto1 = new ContextoTransporte(new TransporteTerrestre());
	        contexto1.executarEntrega("local", 10, 20); 

	        ContextoTransporte contexto2 = new ContextoTransporte(new TransporteAereo());
	        contexto2.executarEntrega("nacional", 80, 40);  

	        ContextoTransporte contexto3 = new ContextoTransporte(new TransporteAereo());
	        contexto3.executarEntrega("nacional", 150, 40); 

	        ContextoTransporte contexto4 = new ContextoTransporte(new TransporteMaritimo());
	        contexto4.executarEntrega("internacional", 500, 400);  
	        
	        ContextoTransporte contexto5 = new ContextoTransporte(new TransporteDrone());
	        contexto5.executarEntrega("metropolitana", 4, 8);  
	    }
}
