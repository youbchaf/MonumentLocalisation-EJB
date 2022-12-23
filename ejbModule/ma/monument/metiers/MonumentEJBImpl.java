package ma.monument.metiers;

import java.util.Date;
import java.util.List;

import javax.annotation.security.PermitAll;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import ma.monuments.entities.Monument;

@Stateless(name = "Monument")

public class MonumentEJBImpl implements MonumentLocal {

	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll

	public boolean add(Monument o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll

	public boolean update(Monument o) {
		// TODO Auto-generated method stub
		Monument su=em.find(Monument.class, o.getId());
		if(su!=null) {
			su.setNom(o.getNom());
			su.setDescription(o.getDescription());
			su.setCreator(o.getCreator());
			su.setDateCreation(o.getDateCreation());
			su.setHeure_close(o.getHeure_close());
			su.setHeure_open(o.getHeure_open());
			su.setLatitude(o.getLatitude());
			su.setLongitude(o.getLongitude());
			su.setRank(o.getRank());
			su.setType(o.getType());
			su.setWeek(o.isWeek());
			su.setZone(o.getZone());
			
			return true;
		}
		return false;
	}

	@Override
	@PermitAll

	public Monument findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Monument.class, id);

	}

	@Override
	@PermitAll

	public boolean delete(int o) {
		// TODO Auto-generated method stub
		em.remove(em.find(Monument.class, o));
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll

	public List<Monument> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Monument");
		return query.getResultList();
	}

	@Override
	@PermitAll
	public List<Monument> findAllByCreatorOrTypeOrVilleOrZoneOrdateCreationOrNom(int idCreator, int idType, int idVille,
			int idZone, Date dateCreation, String nom) {
		TypedQuery<Monument> query = em.createQuery("SELECT m FROM Monument m WHERE m.creator.id = :idCreator OR m.type.id = :idType OR m.zone.id = :idZone OR m.zone.ville.id = :idVille OR m.dateCreation = :dateCreation  OR m.nom = :nom" , Monument.class);
		return query.setParameter("idCreator", idCreator)
			  .setParameter("idType", idType)
			  .setParameter("idVille", idVille)
			  .setParameter("idZone", idZone)
			  .setParameter("dateCreation", dateCreation)
			  .setParameter("nom", nom)
			  .getResultList();
	}


	
}
