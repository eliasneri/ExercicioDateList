package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prints {

	private String media;
	private Date date;
	private int id;
	
	public Prints()	{
		
	}
	
	
	public Prints(String media, Date date, int id) {
		super();
		this.media = media;
		this.date = date;
		this.id = id;
	}



	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
			return id;
				
	}
	
	public String toString() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return "Id: " + id + " - " + sdf2.format(date) + " - " + media;
		
	}
	
}
