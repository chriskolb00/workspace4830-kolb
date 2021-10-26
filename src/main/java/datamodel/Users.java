package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,    
  username VARCHAR(30) NOT NULL,   
  password VARCHAR(30) NOT NULL,
  firstname VARCHAR(30) NOT NULL, 
  lastname VARCHAR(30) NOT NULL,
  email VARCHAR(30) NOT NULL,
  admin INT not null,      
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "user")
public class Users {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "username")
   private String username;

   @Column(name = "password")
   private String password;
   
   @Column(name = "firstname")
   private String firstname; 
   
   @Column(name = "lastname")
   private String lastname;
   
   @Column(name = "email")
   private String email;
   
   @Column(name = "admin")
   private Integer admin; 

   public Users() {
   }

   public Users(Integer id, String username, String password, String firstname, String lastname, String email, Integer admin) {
      this.id = id;
      this.username = username;
      this.password = password; 
      this.email = email;
      this.firstname = firstname;
      this.lastname = lastname; 
      this.admin = admin; 
   }

   public Users(String username, String password, String firstname, String lastname, String email, Integer admin) {
	   this.username = username;
	   this.password = password; 
	      this.email = email;
	      this.firstname = firstname;
	      this.lastname = lastname; 
	      this.admin = admin; 
	   
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getEmail() {
      return email;
   }

   public void setAge(String email) {
      this.email = email;
   }
   
   public String getFirstname() {
	   return firstname; 
   }
   
   public void setFirstname(String firstname) {
	   this.firstname = firstname; 
   }
   
   public String getLastname() {
	   return lastname; 
   }
   
   public void setLastname(String lastname) {
	   this.lastname = lastname; 
   }
   
   public String getPassword() {
	   return password; 
   }
   
   public void setPassword(String password) { 
	   this.password = password; 
   }
   
   public Integer getAdmin() {
	   return admin;
   }
   
   public void setAdmin(Integer admin) {
	   this.admin = admin;
   }

   @Override
   public String toString() {
      return "Employee: " + this.id + ", " + this.username + ", " + this.password+", "+this.firstname+", "+this.lastname+", "+ this.email +", "+this.admin;
   }
}