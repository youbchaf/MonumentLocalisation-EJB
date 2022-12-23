package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.monuments.entities.Type;

@Stateless(name = "Type")

public class TypeEJBImpl implements TypeLocal{

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Type o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Type o) {
		// TODO Auto-generated method stub
		Type su=em.find(Type.class, o.getId());
		if(su!=null) {
			su.setLibelle(o.getLibelle());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public Type findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Type.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Type.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Type> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Type");
		return query.getResultList();
	}

}
