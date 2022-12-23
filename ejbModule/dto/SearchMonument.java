package dto;

import java.util.Date;

public class SearchMonument {
	private int idCreator;
	private int idType;
	private int idVille;
	private int idZone;
	private Date dateCreation;
	private String nom;
	
	public SearchMonument() {
		super();
	}

	public int getIdCreator() {
		return idCreator;
	}

	public void setIdCreator(int idCreator) {
		this.idCreator = idCreator;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public int getIdZone() {
		return idZone;
	}

	public void setIdZone(int idZone) {
		this.idZone = idZone;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public SearchMonument(int idCreator, int idType, int idVille, int idZone, Date dateCreation, String nom) {
		super();
		this.idCreator = idCreator;
		this.idType = idType;
		this.idVille = idVille;
		this.idZone = idZone;
		this.dateCreation = dateCreation;
		this.nom = nom;
	}
	
	
	
	
}
