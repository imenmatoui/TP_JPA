package isamm.projet.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name = "filiere")
public class Filiere {
	@Id
	 @GeneratedValue
	 @Column(name = "idf")
	 private Integer idf;
	 @Column(name = "code")
	 private String code;
	 @Column(name = "libelle")
	 private String libelle;
	 @OneToMany(mappedBy= "filiere")
	private Set<Etudiant> etudiants = new HashSet<Etudiant>();
	 @ManyToMany(mappedBy = "filieres") 
	 private Set<Matiere> matieres = new HashSet<Matiere>();
	public Integer getIdf() {
		return idf;
	}
	public void setIdf(Integer idf) {
		this.idf = idf;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Set<Matiere> getProduits() {
		return matieres;
	}
	public void setProduits(Set<Matiere> produits) {
		this.matieres = produits;
	} 
	 
}
