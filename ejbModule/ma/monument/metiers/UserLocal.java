package ma.monument.metiers;

import java.util.List;

import ma.monuments.entities.User;

public interface UserLocal {

	boolean add(User o);
	boolean delete(int o);
	boolean update(User o);
	User findById(int id);
	List<User> findAll();
}
