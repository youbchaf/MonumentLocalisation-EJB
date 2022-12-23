package ma.monuments.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class MonumentUserPK implements Serializable {

	private static final long serialVersionUID = 1L;
	private int monument;
	private int user;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	
	public MonumentUserPK() {
		super();
	}
	
	

	public int getMonument() {
		return monument;
	}



	public void setMonument(int monument) {
		this.monument = monument;
	}



	public int getUser() {
		return user;
	}



	public void setUser(int user) {
		this.user = user;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public int hashCode() {
		return Objects.hash(date, monument, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonumentUserPK other = (MonumentUserPK) obj;
		return Objects.equals(date, other.date) && monument == other.monument && user == other.user;
	}
	
	
	
}
