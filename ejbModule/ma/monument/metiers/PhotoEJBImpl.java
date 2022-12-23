package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.monuments.entities.Photo;

@Stateless(name = "Photo")

public class PhotoEJBImpl implements PhotoLocal{

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Photo o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Photo o) {
		// TODO Auto-generated method stub
		Photo su=em.find(Photo.class, o.getId());
		if(su!=null) {
			su.setUrl(o.getUrl());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public Photo findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Photo.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Photo.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Photo> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Photo");
		return query.getResultList();
	}

}
