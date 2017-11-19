package isamm.projet.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Filiere;
import isamm.projet.inter.IDao;

public class LigneMatiereETFiliereService implements IDao{

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
	public List findFormateur(Filiere f){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
	    List result = session.createQuery("select m from Matiere as m,  LigneMatiereETFiliere l where l.idf=:id").setParameter("id", f.getIdf()).getResultList();		
	    return result;
		
	}
}
