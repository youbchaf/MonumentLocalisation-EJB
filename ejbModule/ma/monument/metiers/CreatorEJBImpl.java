package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.monuments.entities.Creator;
@PermitAll
@Stateless(name = "Creator")

public class CreatorEJBImpl implements CreatorLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Creator o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Creator o) {
		// TODO Auto-generated method stub
		Creator su=em.find(Creator.class, o.getId());
		if(su!=null) {
			su.setNom(o.getNom());
			su.setDescription(o.getDescription());
			su.setDateDebut(o.getDateDebut());
			su.setDateFin(o.getDateFin());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public Creator findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Creator.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Creator.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Creator> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Creator");
		return query.getResultList();
	}

}
