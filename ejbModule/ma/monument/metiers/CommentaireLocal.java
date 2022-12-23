package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.Commentaire;

public interface CommentaireLocal {

	boolean add(Commentaire o);
	boolean delete(int o);
	boolean update(Commentaire o);
	Commentaire findById(int id);
	List<Commentaire> findAll();
}
