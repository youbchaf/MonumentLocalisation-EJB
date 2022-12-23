package ma.monument.metiers;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.monuments.entities.User;

@Stateless(name = "User")

public class UserEJBImpl implements UserLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(User o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(User o) {
		// TODO Auto-generated method stub
		User su=em.find(User.class, o.getId());
		if(su!=null) {
			su.setNom(o.getNom());
			su.setRole(o.getRole());
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public User findById(int id) {
		// TODO Auto-generated method stub
		return em.find(User.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(User.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<User> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from User");
		return query.getResultList();
	}

}
