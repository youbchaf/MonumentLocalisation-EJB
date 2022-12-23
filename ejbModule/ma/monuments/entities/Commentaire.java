package ma.monuments.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {

	@EmbeddedId
	private MonumentUserPK pk;
	private boolean vote;
	private String contenu;
	@ManyToOne
	@JoinColumn(name = "monument", insertable = false, updatable = false )
	private Monument monument;
	
	@ManyToOne
	@JoinColumn(name = "user", insertable = false, updatable = false)
	private User user;
	
	public Commentaire() {
		super();
	}

	public boolean getVote() {
		return vote;
	}

	public void setVote(boolean vote) {
		this.vote = vote;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	
	public MonumentUserPK getPk() {
		return pk;
	}

	public void setPk(MonumentUserPK pk) {
		this.pk = pk;
	}

	@Override
	public String toString() {
		return "Commentaire [pk=" + pk + ", vote=" + vote + ", contenu=" + contenu + ", monument=" + monument
				+ ", user=" + user + "]";
	}

	
	
}
