package dto;

import ma.monuments.entities.Ville;

public class ZoneVille {
	
	private int idZone;
	private Ville ville;
	public int getIdZone() {
		return idZone;
	}
	public void setIdZone(int idZone) {
		this.idZone = idZone;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	public ZoneVille() {
		super();
	}
	public ZoneVille(int idZone, Ville ville) {
		super();
		this.idZone = idZone;
		this.ville = ville;
	}
}
