package datamodel;

import javax.persistence.*;
import java.util.Date;





/**
 *  @since J2SE-1.8
 CREATE TABLE event(
  `id` INT NOT NULL AUTO_INCREMENT,
  `club` INT NULL,
  `location` VARCHAR(45) NULL,
  `startdate` DATETIME NULL,
  `enddate` DATETIME NULL,
  PRIMARY KEY (`id`));
*/

@Entity
@Table(name = "event")
public class Events{
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "club")
	private Integer club; 
	
	@Column(name = "location")
	private String location; 
	
	@Column(name = "startdate")
	private Date startdate; 
	
	@Column(name = "enddate")
	private Date enddate; 
	
	public Events() {}
	public Events(Integer id, Integer club, String location, Date startdate, Date enddate) {
		
		this.id = id; 
		this.club = club; 
		this.location = location; 
		this.startdate = startdate; 
		this.enddate = enddate; 
		
	}
	public Events(Integer club, String location, Date startdate, Date enddate) {
		 
		this.club = club; 
		this.location = location; 
		this.startdate = startdate; 
		this.enddate = enddate; 
		
	}
	@Override
	public String toString() {
		return "Events [id=" + id + ", club=" + club + ", location=" + location + ", startdate=" + startdate
				+ ", enddate=" + enddate + "]";
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	
	
	
	
}