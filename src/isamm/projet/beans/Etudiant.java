package isamm.projet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
@PrimaryKeyJoinColumn(name = "idFormateur") 
public class Etudiant extends Personne {
	@Column(name = "cne")
	 private String cne;
	@ManyToOne 
	 @JoinColumn(name = "id", insertable = false, updatable = false) 
	 private Filiere filiere;

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
}
