package controleur;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modele.*;
import vue.*;

public class Main extends Application{
	static private FenNouvelEmploye fNouvEmp;
	static private FenModifierEmploye fModifierEmp;
	static private FenListeEmployes fListeEmp;
	
	public void start(Stage f) throws Exception {
		
		Donnees.chargementDonnees();
		//initialisation des fenêtres
		fNouvEmp = new FenNouvelEmploye();
		fModifierEmp = new FenModifierEmploye();
		fListeEmp = new FenListeEmployes();
		fListeEmp.show();
	} 
	
	static public void main(String args[]) { 
		Application.launch(args); 
	}
	
	static public void fermerAppli() {

	}
	
	
	///////////////////////
	// gestion des fenêtres
	///////////////////////
	static public void ouvrirNouvelEmploye() {

	}
	
	static public void fermerNouvelEmploye() {

	}
	
	static public void ouvrirModifierEmploye(Employe e) {

	}
	
	static public void fermerModifierEmploye() {

	}
	
	
	
	//////////////////////////////////////////
	// gestion des données : les modifications
	//////////////////////////////////////////
	static public void ajouterEmploye(int mat, String nom, String poste, int sup, int jour, int mois, int annee, float sal, float pri, int dpt) { 
		// créer le nouvel employé
		Employe e = new Employe(mat, nom, poste, sup, jour+"/"+mois+"/"+annee, sal, pri, dpt);
		// enregistrer l'ajout
		Donnees.ajouterEmploye(e);
		fNouvEmp.close();
	}
	
	static public void modifierEmploye(int mat, String nom, String poste, int sup, int jour, int mois, int annee, float sal, float pri, int dpt) { 
		// créer le nouvel employé
		Employe e = new Employe(mat, nom, poste, sup, jour+"/"+mois+"/"+annee, sal, pri, dpt);
		// appel à la méthode de la classe Donnees pour enregistrer la modif ; Penser à fermer la fenêtre
		
		
		
	}
	
	static public void supprimerEmploye(Employe e) {

	}

	
	//////////////////////////////////////////
	// gestion des données : les consultations
	//////////////////////////////////////////
	static public ObservableList<Employe> getLesEmployes(){
		return Donnees.getLesEmployes();
	}
	
	static public ArrayList<Integer> getLesSuperieurs(){
		return Donnees.getLesSuperieurs();
	}
	
	static public ArrayList<Integer> getLesDepartements(){
		return Donnees.getLesDepartements();
	}
}
