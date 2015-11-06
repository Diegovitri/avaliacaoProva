package servico;

import java.util.List;

import dominio.Participacao;

public interface ParticipacaoServico {
	public void inserirAtualizar(Participacao b);
	public void excluir(Participacao b);
	public  Participacao buscar(int cod);
	public List<Participacao> buscarTodos();


}
