package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.Type;

public interface TypeLocal {

	boolean add(Type o);
	boolean delete(int o);
	boolean update(Type o);
	Type findById(int id);
	List<Type> findAll();
}
