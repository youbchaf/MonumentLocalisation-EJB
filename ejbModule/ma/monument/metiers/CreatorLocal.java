package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.Creator;

public interface CreatorLocal {

	boolean add(Creator o);
	boolean delete(int o);
	boolean update(Creator o);
	Creator findById(int id);
	List<Creator> findAll();
}
