package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dto.ZoneVille;
import ma.monuments.entities.Zone;

@Stateless(name = "Zone")

public class ZoneEJBImpl implements ZoneLocal{

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Zone o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Zone o) {
		// TODO Auto-generated method stub
		Zone su=em.find(Zone.class, o.getId());
		if(su!=null) {
			su.setNom(o.getNom());
			su.setVille(o.getVille());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public Zone findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Zone.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Zone.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Zone> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Zone");
		return query.getResultList();
	}

	@Override
	@PermitAll

	public boolean addZoneToVille(ZoneVille o) {
		// TODO Auto-generated method stub
		try {
			Zone su=em.find(Zone.class, o.getIdZone());
			su.setVille(o.getVille());
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
	}

}
