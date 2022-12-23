package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.monuments.entities.Ville;

@Stateless(name = "Ville")

public class VilleEJBImpl implements VilleLocal {

	public VilleEJBImpl() {
	    super();
	}
	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll
	public boolean add(Ville o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll
	public boolean update(Ville o) {
		// TODO Auto-generated method stub
		Ville su=em.find(Ville.class, o.getId());
		if(su!=null) {
			su.setNom(o.getNom());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Ville.class, id);

	}

	@Override
	@PermitAll
	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Ville.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll
	public List<Ville> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Ville");
		return query.getResultList();
	}

}
