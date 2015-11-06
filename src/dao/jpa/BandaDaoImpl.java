package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.BandaDao;
import dominio.Banda;

public class BandaDaoImpl implements BandaDao {
	
	private EntityManager em;
	
	public BandaDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Banda b) {
		if(b.getCodBanda() != null){
			b = em.merge(b);
		}
		em.persist(b);

	}

	@Override
	public void excluir(Banda b) {
		b = em.merge(b);
		em.remove(b);

	}

	@Override
	public Banda buscar(int cod) {
		return em.find(Banda.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Banda> buscarTodos() {
		String jpql = "SELECT x FROM Banda x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
