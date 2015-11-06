package dao;

import java.util.List;

import dominio.Espetaculo;

public interface EspetaculoDao {
	public void inserirAtualizar(Espetaculo e);
	public void excluir(Espetaculo e);
	public  Espetaculo buscar(int cod);
	public List<Espetaculo> buscarTodos();

}
