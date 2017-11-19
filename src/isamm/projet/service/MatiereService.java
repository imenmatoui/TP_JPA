package isamm.projet.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import isamm.projet.beans.Filiere;
import isamm.projet.beans.Matiere;
import isamm.projet.inter.IDao;

public class MatiereService implements IDao{

	@Override
	public boolean create(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int id, Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Matiere find(int id){
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory SF = con.buildSessionFactory();
	Session session = SF.openSession();
	Transaction TR = session.beginTransaction();
	Matiere c=(Matiere)session.get(Matiere.class, id); 	
	return c;
	}
	
	public  Matiere findNom(String nom){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
	    Object result = (Matiere)session.createQuery("from Matiere as e where e.code=:nom").setParameter("nom", nom).getSingleResult();	
		return (Matiere) result;
	}
	
	public void create1(Matiere obj) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			
				session.save(obj);
				tx.commit();}catch(Exception e){
					if(tx != null){
						tx.rollback();
					}}finally{
						session.close();
					}
				}

}
