package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ParticipacaoDao;
import dominio.Participacao;

public class ParticipacaoDaoImpl implements ParticipacaoDao {

	private EntityManager em;

	public ParticipacaoDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Participacao b) {
		if(b.getCodParticipacao() != null){
			b = em.merge(b);
		}
		em.persist(b);

	}

	@Override
	public void excluir(Participacao b) {
		b = em.merge(b);
		em.remove(b);

	}

	@Override
	public Participacao buscar(int cod) {
		return em.find(Participacao.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Participacao> buscarTodos() {
		String jpql = "SELECT x FROM Participacao x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
