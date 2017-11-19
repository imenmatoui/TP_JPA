package isamm.projet.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import isamm.projet.beans.Etudiant;
import isamm.projet.beans.Filiere;
import isamm.projet.beans.Formateur;
import isamm.projet.beans.Matiere;
import isamm.projet.beans.Personne;
import isamm.projet.service.EtudiantService;
import isamm.projet.service.FiliereService;
import isamm.projet.service.FormateurService;
import isamm.projet.service.LigneMatiereETFiliereService;
import isamm.projet.service.MatiereService;

public class Demo {

	private static Set<Matiere> matieres1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation filiere
		FiliereService fe = new FiliereService();
		Filiere fil = new Filiere();
		fil.setCode("IIAI");
		fe.create1(fil);
		
		FiliereService fe1 = new FiliereService();
		Filiere fil1 = new Filiere();
		fil1.setCode("IRT");
		fe1.create1(fil1);
		
		FiliereService fe2 = new FiliereService();
		Filiere fil2 = new Filiere();
		fil2.setCode("IIR");
		fe2.create1(fil2);
		///creation matiere
		MatiereService mat = new MatiereService();
		Matiere m11 = new Matiere();
		m11.setCode("TCP");
		mat.create1(m11);
		
		MatiereService mat1 = new MatiereService();
		Matiere m111 = new Matiere();
		m111.setCode("JB");
		mat1.create1(m111);
		
		MatiereService mat12 = new MatiereService();
		Matiere m1112 = new Matiere();
		m1112.setCode("AU");
		mat12.create1(m1112);
		
		MatiereService mat13 = new MatiereService();
		Matiere m1113 = new Matiere();
		m1113.setCode("Hibernate");
		mat13.create1(m1113);
		
		MatiereService mat14 = new MatiereService();
		Matiere m1114 = new Matiere();
		m1114.setCode("POO");
		mat13.create1(m1114);
		
		//creer formateur
		FormateurService form = new FormateurService();
		Formateur fo = new Formateur();
		fo.setNom("SELIMANI");
		fo.setPrenom("Yahya");
		MatiereService matiere = new MatiereService();
		Matiere matiere1 = matiere.findNom("CLOUD");	
		form.create1(fo , matiere1);
		
		FormateurService form1 = new FormateurService();
		Formateur fo1 = new Formateur();
		fo1.setNom(" SAFI");
		fo1.setPrenom(" Ilham ");
		MatiereService matiere11 = new MatiereService();
		Matiere matiere111 = matiere.findNom("CLOUD");	
		form1.create1(fo1, matiere111);
		
		///creation etudiant
		EtudiantService form11 = new EtudiantService();
		Etudiant etud = new Etudiant();
		etud.setNom(" SAFI");
		etud.setPrenom(" Amal ");
		etud.setCne("22845676");	
		form11.create1(etud);
		
		EtudiantService form112 = new EtudiantService();
		Etudiant etud2 = new Etudiant();
		etud2.setNom(" ALAMI");
		etud2.setPrenom(" Samir");
		etud2.setCne("22845676");	
		form112.create1(etud2);
		
		EtudiantService form1123 = new EtudiantService();
		Etudiant etud23 = new Etudiant();
		etud23.setNom(" ALAOUI ");
		etud23.setPrenom(" SAFA");
		etud23.setCne("22845676");	
		form11.create1(etud23);
		
		FormateurService f = new FormateurService();
		List l = f.findFormateur();
		Iterator i=l.iterator(); 
		while(i.hasNext()) {
			System. out .println (((Formateur) i .next ()). getNom()); 
			}
		FiliereService m = new FiliereService();
		List l1 = m.findEtudiant();
		Iterator i1 = l1.iterator();
		while(i1.hasNext()) {
			System. out .println (((Etudiant) i1 .next ()).getNom()); 
			}
		
		FiliereService f2 = new FiliereService();
		Filiere f3 =f2.find(1);
		LigneMatiereETFiliereService l4 = new LigneMatiereETFiliereService();
		List l5 = l4.findFormateur(f3);
		Iterator i6=l5.iterator(); 
		while(i6.hasNext()) {
			System. out .println (((Matiere) i6 .next ()).getLibelle()); 
			}
		
	
	}

	}

