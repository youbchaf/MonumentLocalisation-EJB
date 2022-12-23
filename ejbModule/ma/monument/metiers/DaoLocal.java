package ma.monument.metiers;

import java.util.List;

import javax.ejb.Local;

@Local
public interface DaoLocal <T> {


	boolean add(T o);
	boolean delete(int o);
	boolean update(T o);
	T findById(int id);
	List<T> findAll();


}
