package aplicacao;

import java.math.BigDecimal;

import dominio.Banda;
import servico.BandaServico;
import servico.ServicoFactory;

public class Principal {
	public static void main(String[] args){
		
		BandaServico bandaServico = ServicoFactory.criarBandaServico();
		
		BigDecimal d1 = new BigDecimal("10000.00");
		BigDecimal d2 = new BigDecimal("5000.00");
		BigDecimal d3 = new BigDecimal("400.00");
		BigDecimal d4 = new BigDecimal("20000.00");
		BigDecimal d5 = new BigDecimal("30000.00");
		
		Banda b1 = new Banda(null,"Calipso",d1);
		Banda b2 = new Banda(null,"Oficina G3",d2);
		Banda b3 = new Banda(null,"Korus",d3);
		Banda b4 = new Banda(null,"Catedral",d4);
		Banda b5 = new Banda(null,"Los Hermanos",d5);
		
		bandaServico.inserirAtualizar(b1);
		bandaServico.inserirAtualizar(b2);
		bandaServico.inserirAtualizar(b3);
		bandaServico.inserirAtualizar(b4);
		bandaServico.inserirAtualizar(b5);
		
	}

}
