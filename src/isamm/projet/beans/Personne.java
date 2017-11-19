package isamm.projet.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity 
@Inheritance(strategy = InheritanceType.JOINED) 
@Table(name = "personne")
public class Personne {
	@Id
	 @GeneratedValue
	 @Column(name = "id")
	 private Integer id;
	 @Column(name = "nom")
	 private String nom;
	 @Column(name = "prenom")
	 private String prenom;
	 @Column(name = "telephone")
	 private String telephone;
	 @Column(name = "email")
	 private String email;
	 @Column(name = "sexe")
	 private String sexe;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	 

}
