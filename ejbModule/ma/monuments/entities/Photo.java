package ma.monuments.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photo
 *
 */
@Entity

public class Photo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String url;
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "monument_id")
    private Monument monument;
    
	private static final long serialVersionUID = 1L;
	
	
	public Photo() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public Monument getMonument() {
		return monument;
	}
	public void setMonument(Monument monument) {
		this.monument = monument;
	}
   
	
}
