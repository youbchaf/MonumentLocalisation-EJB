package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.Ville;

public interface VilleLocal {

	boolean add(Ville o);
	boolean delete(int o);
	boolean update(Ville o);
	Ville findById(int id);
	List<Ville> findAll();
}
