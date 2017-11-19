package isamm.projet.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Etudiant;
import isamm.projet.beans.Formateur;
import isamm.projet.beans.Matiere;
import isamm.projet.inter.IDao;

public class EtudiantService implements IDao{

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
	
	public void create1(Etudiant obj) {
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
