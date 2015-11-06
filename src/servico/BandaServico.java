package servico;

import java.util.List;

import dominio.Banda;

public interface BandaServico {
	public void inserirAtualizar(Banda b);
	public void excluir(Banda b);
	public  Banda buscar(int cod);
	public List<Banda> buscarTodos();

}
