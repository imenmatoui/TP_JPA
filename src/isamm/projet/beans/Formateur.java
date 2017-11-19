package isamm.projet.beans;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
@Table(name = "formateur")
@PrimaryKeyJoinColumn(name = "idFormateur") 
public class Formateur  extends Personne{
	@Column(name = "matricule")
	 private String matricule;
	@OneToMany(mappedBy= "formateur")
	private Set<Matiere> matieres = new HashSet<Matiere>();


	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Set<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Set<Matiere> matieres) {
		this.matieres = matieres;
	}
	public List findFormateur(){
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SF = con.buildSessionFactory();
		Session session = SF.openSession();
		Transaction TR = session.beginTransaction();
	    List result = session.createQuery("from formateur as f, Matiere e where f.idFormateur=e.idFormateur and e.id=:id").setParameter("id", 1).getResultList();		
		
	    
	    return result;
		
	}
	

}
