package ma.monuments.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Monument
 *
 */
@Entity
public class Monument implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String description;
	private double latitude;
	private double longitude;
	private String rank;
	private String heure_open;
	private String heure_close;
	private boolean week;
	
    @JsonbDateFormat("dd-MM-yyyy")
	private Date dateCreation;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Zone zone;
	
	@ManyToOne
	private Creator creator;
	
	@ManyToOne 
	private Type type;
	
    
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getHeure_open() {
		return heure_open;
	}

	public void setHeure_open(String heure_open) {
		this.heure_open = heure_open;
	}

	public String getHeure_close() {
		return heure_close;
	}

	public void setHeure_close(String heure_close) {
		this.heure_close = heure_close;
	}

	public boolean isWeek() {
		return week;
	}

	public void setWeek(boolean week) {
		this.week = week;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	

	
	
	
	
	
	public Monument() {
		super();
	}

	@Override
	public String toString() {
		return "Monument [id=" + id + ", nom=" + nom + ", description=" + description + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", rank=" + rank + ", heure_open=" + heure_open + ", heure_close="
				+ heure_close + ", week=" + week + ", dateCreation=" + dateCreation + ", zone=" + zone + ", creator="
				+ creator + ", type=" + type + "]";
	}   
	
   
}
