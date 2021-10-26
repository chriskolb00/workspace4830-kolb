package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
CREATE TABLE club (
  `id` INT NOT NULL AUTO_INCREMENT,
  `clubname` VARCHAR(45) NULL,
  `distributionlist` VARCHAR(255) NULL,
  PRIMARY KEY (`id`));
 */
@Entity
@Table(name = "club")
public class Clubs {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "clubname")
   private String clubname;

   @Column(name = "distributionlist")
   private String distributionlist;
   


   public Clubs() {
   }
   
   public Clubs(String clubname) {
	      this.clubname = clubname; 
	   }

   public Clubs(String clubname, String distributionlist) {
      this.clubname = clubname;
      this.distributionlist = distributionlist; 
   }
   public Clubs(Integer id, String clubname, String distributionlist) {
	      this.id = id;
	      this.clubname = clubname;
	      this.distributionlist = distributionlist; 
	   }

@Override
public String toString() {
	return "Clubs [id=" + id + ", clubname=" + clubname + ", distributionlist=" + distributionlist + "]";
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getClubname() {
	return clubname;
}

public void setClubname(String clubname) {
	this.clubname = clubname;
}

public String getDistributionlist() {
	return distributionlist;
}

public void setDistributionlist(String distributionlist) {
	this.distributionlist = distributionlist;
}

	   
   }