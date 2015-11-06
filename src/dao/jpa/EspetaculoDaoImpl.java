package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.EspetaculoDao;
import dominio.Espetaculo;

public class EspetaculoDaoImpl implements EspetaculoDao {
	
	private EntityManager em;

	public EspetaculoDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserirAtualizar(Espetaculo e) {
		if(e.getCodEspetaculo() != null){
			e = em.merge(e);
		}
		em.persist(e);

	}

	@Override
	public void excluir(Espetaculo e) {
		e = em.merge(e);
		em.remove(e);

	}

	@Override
	public Espetaculo buscar(int cod) {
		return em.find(Espetaculo.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Espetaculo> buscarTodos() {
		String jpql = "SELECT x FROM Espetaculo x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
