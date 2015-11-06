package dao;

import java.util.List;

import dominio.Banda;

public interface BandaDao {
	public void inserirAtualizar(Banda b);
	public void excluir(Banda b);
	public  Banda buscar(int cod);
	public List<Banda> buscarTodos();

}
