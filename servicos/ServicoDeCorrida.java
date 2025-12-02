package servicos;
import entidades.*;
import excecoes.*;
public class ServicoDeCorrida {

	public Corrida solicitarCorrida(Passageiro p, String origem, String destino, Categoria cat) throws PassageiroPendenteException {
		if(p.isEmDebito()) {
	        throw new PassageiroPendenteException("O passageiro não pode solicitar...");
	    }
	    
	    Corrida c = new Corrida(p, origem, destino, cat, 0);
	    c.setStatus(StatusCorrida.SOLICITADA);
	    System.out.println("Corrida solicitada de " + origem + " até " + destino);
		return c;
		}
		
	
	public void aceitarCorrida(Corrida c, Motorista m) throws NenhumMotoristaDisponivelException {
		if(m.getStatus() != StatusMotorista.ONLINE) {
			throw new NenhumMotoristaDisponivelException("Nenhum motorista disponivel");
		}
		else {
			c.setStatus(StatusCorrida.ACEITA);
			m.setStatus(StatusMotorista.EM_CORRIDA);
		}
	}
	public void iniciarCorrida(Corrida c) throws EstadoInvalidoDaCorridaException {
		if (c.getStatus() != StatusCorrida.ACEITA) {
        throw new EstadoInvalidoDaCorridaException("Corrida não está no estado ACEITA.");
    }
		else {
		    c.iniciarViagem();
		    c.setStatus(StatusCorrida.EM_ANDAMENTO);
		}
		}
	   
	public void finalizarCorrida(Corrida c, double km) throws EstadoInvalidoDaCorridaException, PagamentoRecusadoException, SaldoInsuficienteException {

        if (c.getStatus() != StatusCorrida.EM_ANDAMENTO) {
            throw new EstadoInvalidoDaCorridaException("Corrida não está EM_ANDAMENTO.");
        }
        
        double valorFinal = c.getCategoria().calcularPreco(km);
        c.setDistanciaKm(km);
        c.setValorFinal(valorFinal);
		    
         try {
        	    c.getMetodoPagamento().processarPagamento(valorFinal);
        	 } catch (SaldoInsuficienteException e) {
        	     throw new PagamentoRecusadoException("Pagamento recusado: " + e.getMessage());
        	 } 
	}
	public void cancelarCorrida(Corrida c) throws EstadoInvalidoDaCorridaException {
	    if(c.getStatus() == StatusCorrida.FINALIZADA) {
	        throw new EstadoInvalidoDaCorridaException("Corrida já finalizada!");
	    }
	    
	    c.setStatus(StatusCorrida.CANCELADA); // ✅ CANCELADA, não FINALIZADA
	    
	    if(c.getMotorista() != null) {
	        c.getMotorista().setStatus(StatusMotorista.ONLINE);
	    }
	}
}
	
	
	


