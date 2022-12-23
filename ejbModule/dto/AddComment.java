package dto;

import java.util.Date;

public class AddComment {
	private int user;
	private int monument;
	private Date date;
	private String vote;
	private String contenu;
	public AddComment(int user, int monument, Date date, String vote, String contenu) {
		super();
		this.user = user;
		this.monument = monument;
		this.date = date;
		this.vote = vote;
		this.contenu = contenu;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getMonument() {
		return monument;
	}
	public void setMonument(int monument) {
		this.monument = monument;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getVote() {
		return vote;
	}
	public void setVote(String vote) {
		this.vote = vote;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	
}
