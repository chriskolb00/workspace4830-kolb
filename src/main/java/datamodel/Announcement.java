package datamodel;

import javax.persistence.*;
import java.util.Date;

/**
 * @since J2SE-1.8
CREATE TABLE announcement (
  `id` INT NOT NULL AUTO_INCREMENT,
  `club` INT NULL,
  `date` DATE NULL,
  `poster` INT NULL,
  `message` LONGTEXT NULL,
  PRIMARY KEY (`id`));
 */
@Entity
@Table(name = "announcement")

public class Announcement {
	  @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id")
	   private Integer id; 
	  
	  @Column(name = "club")
	  private Integer club; 
	  
	  @Column(name = "date")
	  private Date date; 
	  
	  @Column(name = "poster")
	  private Integer poster; 
	  
	  @Column(name = "message")
	  private String message; 
	  
	public Announcement () {}
	public Announcement(Integer id, Integer club, Date date, Integer poster, String message ) {
		this.id = id; 
		this.club = club; 
		this.date = date; 
		this.poster = poster; 
		this.message = message; 
	}
	public Announcement(Integer club, Date date, Integer poster, String message) {
		this.club = club; 
		this.date = date; 
		this.poster = poster; 
		this.message = message; 
	}
	@Override
	public String toString() {
		return "Announcement [id=" + id + ", club=" + club + ", date=" + date + ", poster=" + poster + ", message="
				+ message + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getClub() {
		return club;
	}
	public void setClub(Integer club) {
		this.club = club;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPoster() {
		return poster;
	}
	public void setPoster(Integer poster) {
		this.poster = poster;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}