package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.monuments.entities.Commentaire;

@Stateless(name = "Commentaire")

public class CommentaireEJBImpl implements CommentaireLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Commentaire o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Commentaire o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@PermitAll

	public Commentaire findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Commentaire.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Commentaire.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Commentaire> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Commentaire");
		return query.getResultList();
	}

}
