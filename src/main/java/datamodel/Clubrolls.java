package datamodel;

import javax.persistence.*;


/**
 *  @since J2SE-1.8
CREATE TABLE clubroles (
  `id` INT NOT NULL AUTO_INCREMENT,
  `rolename` VARCHAR(45) NULL,
  `permissions` LONGTEXT NULL,
  PRIMARY KEY (`id`));
*/


@Entity
@Table(name = "clubrolls")
public class Clubrolls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer id; 
	
	@Column(name = "rollname")
	private String rollname; 
	
	@Column(name = "permissions")
	private String permissions; 
	
	public Clubrolls() {}
	public Clubrolls(Integer id, String rollname, String permissions) {
		this.id = id; 
		this.rollname = rollname; 
		this.permissions = permissions; 
	
	
	}
	public Clubrolls(String rollname, String permissions) {
		this.rollname = rollname; 
		this.permissions = permissions; 
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRollname() {
		return rollname;
	}
	public void setRollname(String rollname) {
		this.rollname = rollname;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "Clubrolls [id=" + id + ", rollname=" + rollname + ", permissions=" + permissions + "]";
	}
	
	
	
	
	
}