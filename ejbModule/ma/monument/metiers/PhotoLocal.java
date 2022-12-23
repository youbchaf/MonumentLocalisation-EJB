package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.Photo;

public interface PhotoLocal {

	boolean add(Photo o);
	boolean delete(int o);
	boolean update(Photo o);
	Photo findById(int id);
	List<Photo> findAll();
}
