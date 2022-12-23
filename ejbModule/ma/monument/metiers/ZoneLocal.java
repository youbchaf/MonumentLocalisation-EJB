package ma.monument.metiers;

import java.util.List;

import dto.ZoneVille;
import ma.monuments.entities.Zone;

public interface ZoneLocal {

	boolean add(Zone o);
	boolean delete(int o);
	boolean update(Zone o);
	Zone findById(int id);
	List<Zone> findAll();
	boolean addZoneToVille(ZoneVille o);

}
