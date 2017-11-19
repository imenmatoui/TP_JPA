package isamm.projet.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Filiere;
import isamm.projet.beans.Matiere;
import isamm.projet.inter.IDao;

public class FiliereService implements IDao{

	@Override
	public boolean create(Object obj) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
		Filiere f = new Filiere();
		f = (Filiere) obj;
		session.save(f);
		return true;
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

	public List findEtudiant(){
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
	    List result = session.createQuery("select e from Etudiant as e, Filiere f where f.idf=e.filiere.idf and f.idf=:id").setParameter("id", 1).getResultList();		
		
	    
	    return result;
	}
	public Filiere find(int id){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
		Filiere c=(Filiere)session.get(Filiere.class, id); 	
		return c;
		}
	
	public void create1(Filiere obj) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Filiere fil = new Filiere();
			fil.setCode(obj.getCode());
				session.save(fil);
				tx.commit();}catch(Exception e){
					if(tx != null){
						tx.rollback();
					}}finally{
						session.close();
					}
				}
	}



