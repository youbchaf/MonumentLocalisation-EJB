package ma.monument.metiers;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DaoRemote<T> {

	boolean add(T o);
	boolean delete(int o);
	boolean update(T o);
	T findById(int id);
	List<T> findAll();

}
