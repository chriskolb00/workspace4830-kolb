/**
 */
package util;

import java.util.List;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import datamodel.ClubMembers;
import datamodel.Clubs;
import datamodel.Users;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @since JavaSE-1.8
 */
public class UtilDB {
	static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory != null) {
			return sessionFactory;
		}
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public static int Login(String username, String password) {

		int result = 0;

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "FROM Users WHERE username = :username AND password = :password";
		try {
			System.out.println("in Login"); 	
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			System.out.println("Query Created"); 	
			query.setParameter("username", username);
			query.setParameter("password", password);
			List<?> results = query.list();
			System.out.println("results returned"); 	
			if (results.size() > 0) {
				System.out.println("in results"); 	
			Users user = (Users)results.get(0); 
			System.out.println("User object created"); 	
				result = user.getId();
				System.out.println("got ID"); 	
			} else {
				result = 0;
			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			result = 0;
		} finally {
			session.close();
		}

		return result;
	}

	public static Boolean UserExists(String username) {

		Boolean result = false;

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "FROM Users WHERE username = :username";
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("username", username);
			List<?> results = query.list();

			if (results.size() > 0) {
				result = true;
			} else {
				result = false;
			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			result = false;
		} finally {
			session.close();
		}

		return result;
	}

	public static Boolean createUser(String username, String password, String firstname, String lastname, String email,
			Integer admin) {
		Boolean userExists = UserExists(username); 
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		Boolean result = false;

		if (!userExists) {

			try {
				tx = session.beginTransaction();
				session.save(new Users(username, password, firstname, lastname, email, admin));
				tx.commit();
				result = true;
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
				result = false;
			} finally {
				session.close();
			}

		} else {
			result = false;
		}

		return result;
	}

	public static int createClub(String clubname, int User) {
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		int result = 0;
		try {
			tx = session.beginTransaction();
			session.save(new Clubs(clubname));
			tx.commit();
			result = 1;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			result = 0;
		} finally {
			session.close();
		}
		
		if(result == 1) {
			int clubId = getClubId(clubname); 
			addUserToClub(User, clubId, 1);
			result = clubId; 
		}
		return result;
	}

	public static Boolean clubExists(String clubname) {

		Boolean result = false;

		Session session = getSessionFactory().openSession();
		
		Transaction tx = null;
		String sql = "FROM Clubs WHERE clubname = :clubname";
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("clubname", clubname);
			List<?> results = query.list();

			if (results.size() > 0) {
				result = true;
			} else {
				result = false;
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
				result = false;
			}
		} finally {
			session.close();
		}

		return result;
	}
	
	public static Boolean addUserToClub(int user, int club, int roll) {
		
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		Boolean result = false;
		
		if (!isUserInClub(user, club)) {
		
		try {
			tx = session.beginTransaction();
			session.save(new ClubMembers(club, user, roll));
			tx.commit();
			result = true;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			result = false;
		} finally {
			session.close();
		}
		}
		
		
		return result;
	}
	
	public static Boolean isUserInClub(int user, int club) {
		Boolean result = false;
		
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "FROM ClubMembers WHERE user = :user";
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery(sql);
			query.setParameter("user", user);
			List<?> results = query.list();

			if (results.size() > 0) {
				result = true;
			} else {
				result = false;
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
				result = false;
			}
		} finally {
			session.close();
		}
		
		return result; 
	}
	
	public static int getClubId(String clubName) {
	int clubId = 0; 
	
	Session session = getSessionFactory().openSession();
	Transaction tx = null;
	String sql = "FROM Clubs WHERE clubname = :clubname";
	try {
		tx = session.beginTransaction();
		Query query = session.createQuery(sql);
		query.setParameter("clubname", clubName);
		List<?> results = query.list();
		if (results.size() > 0) {
		Clubs club = (Clubs)results.get(0); 
			clubId = club.getId();
		} else {
			clubId = 0;
		}

		tx.commit();
	} catch (HibernateException e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
		clubId = 0;
	} finally {
		session.close();
	}
	
	
	
	return clubId; 
	}
	
	public static String getClubById(int id) {
	String clubName = ""; 
	
	Session session = getSessionFactory().openSession();
	Transaction tx = null;
	String sql = "FROM Clubs WHERE id = :id";
	try {
		tx = session.beginTransaction();
		Query query = session.createQuery(sql);
		query.setParameter("id", id);
		List<?> results = query.list();
		if (results.size() > 0) {
		Clubs club = (Clubs)results.get(0); 
			clubName = club.getClubname();
		} else {
			clubName = "";
		}

		tx.commit();
	} catch (HibernateException e) {
		if (tx != null)
			tx.rollback();
		e.printStackTrace();
		clubName = "";
	} finally {
		session.close();
	}
	
	
	
	return clubName; 
	}
	
}