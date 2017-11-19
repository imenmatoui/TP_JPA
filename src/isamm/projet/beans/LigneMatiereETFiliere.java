package isamm.projet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "lignematiereetfiliere")
public class LigneMatiereETFiliere {
	@Id
	 @GeneratedValue
	 @Column(name = "idll")
	 private Integer idl;
	 @Column(name = "masseHoraire")
	 private int masseHoraire;
	 private int id;
	 private int idf;
	public Integer getIdl() {
		return idl;
	}
	public void setIdl(Integer idl) {
		this.idl = idl;
	}
	public int getMasseHoraire() {
		return masseHoraire;
	}
	public void setMasseHoraire(int masseHoraire) {
		this.masseHoraire = masseHoraire;
	}
	 
}
