package isamm.projet.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "matiere")
public class Matiere {
	@Id
	 @GeneratedValue
	 @Column(name = "id")
	 private Integer id;
	 @Column(name = "code")
	 private String code;
	 @Column(name = "libelle")
	 private String libelle;
	 @ManyToOne 
	 @JoinColumn(name = "idFormateur", insertable = false, updatable = false) 
	 private Formateur formateur;

	 @ManyToMany
	 @JoinTable(name= "LigneMatiereETFiliere", joinColumns = { @JoinColumn(name = "id") }, inverseJoinColumns = { @JoinColumn(name = "idf") })
	 private Set<Filiere> filieres = new HashSet<Filiere>();

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Set<Filiere> getFilieres() {
		return filieres;
	}
	public void setFilieres(Set<Filiere> filieres) {
		this.filieres = filieres;
	}
	
	 

}
