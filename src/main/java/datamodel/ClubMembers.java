
package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
CREATE TABLE clubmembers (
  `id` INT NOT NULL AUTO_INCREMENT,
  `club` INT NULL,
  `user` INT NULL,
  `role` INT NULL,
  PRIMARY KEY (`id`));
 */
@Entity
@Table(name = "clubmembers")

public class ClubMembers {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id")
	   private Integer id; 
	   
	   @Column(name = "club")
	   private Integer club; 
	   
	   @Column(name = "user")
	   private Integer user; 
	   
	   @Override
	public String toString() {
		return "ClubMembers [id=" + id + ", club=" + club + ", user=" + user + ", role=" + role + "]";
	}

	@Column(name = "role")
	   private Integer role; 
	   
	   public ClubMembers() {}
	   
	   public ClubMembers(Integer id, Integer club, Integer user, Integer role) {
		   this.id = id; 
		   this.club = club; 
		   this.user = user; 
		   this.role = role; 
	   }
	   public ClubMembers(Integer club, Integer user, Integer role) {
		   this.club = club; 
		   this.user = user; 
		   this.role = role; 
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

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
}