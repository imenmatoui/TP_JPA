package isamm.projet.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Matiere;
import isamm.projet.beans.Filiere;
import isamm.projet.beans.Formateur;
import isamm.projet.inter.IDao;

public class FormateurService implements IDao{

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
	
	public List findFormateur(){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
	    List result = session.createQuery("select f from Formateur as f, Matiere e where f.id=e.formateur.id and e.id=:id").setParameter("id", 1).getResultList();		
		
	    
	    return result;
		
	}
	public void create1(Formateur obj, Matiere m1) {
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

