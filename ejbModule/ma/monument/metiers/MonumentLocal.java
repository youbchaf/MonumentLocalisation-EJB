package ma.monument.metiers;

import java.util.Date;
import java.util.List;

import ma.monuments.entities.Monument;

public interface MonumentLocal {

	boolean add(Monument o);
	boolean delete(int o);
	boolean update(Monument o);
	Monument findById(int id);
	List<Monument> findAll();
	List<Monument> findAllByCreatorOrTypeOrVilleOrZoneOrdateCreationOrNom(int idCreator, int idType, int idVille , int idZone , Date dateCreation, String nom);
}
