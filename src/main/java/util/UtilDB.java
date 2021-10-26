/**
 */
package util;

import java.util.List;
//import java.util.ArrayList;
//import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import datamodel.Clubs;
import datamodel.Users;

import org.hibernate.HibernateException;
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

	public static Boolean Login(String username, String password) {

		Boolean result = false;

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "Select id FROM user WHERE username = :username AND password = :password";
		try {
			tx = session.beginTransaction();
			SQLQuery query = session.createSQLQuery(sql);
			query.setParameter("username", username);
			query.setParameter("password", password);
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

	public static Boolean UserExists(String username) {

		Boolean result = false;

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "Select id FROM user WHERE username = :username";
		try {
			tx = session.beginTransaction();
			SQLQuery query = session.createSQLQuery(sql);
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
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		Boolean result = false;

		if (!UserExists(username)) {

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

	public static Boolean createClub(String clubname) {
		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		Boolean result = false;
		try {
			tx = session.beginTransaction();
			session.save(new Clubs(clubname));
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

		return result;
	}

	public static Boolean clubExists(String clubname) {

		Boolean result = false;

		Session session = getSessionFactory().openSession();
		Transaction tx = null;
		String sql = "Select id FROM user WHERE clubname = :clubname";
		try {
			tx = session.beginTransaction();
			SQLQuery query = session.createSQLQuery(sql);
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
}