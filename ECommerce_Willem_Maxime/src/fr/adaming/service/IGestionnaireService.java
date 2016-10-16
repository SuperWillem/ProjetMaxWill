package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Categorie;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireService {

	/**
	 * M�thode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGestsService();
	
	
	/**
	 * M�thode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProdsService();
	
	
	/**
	 * M�thode pour cr�er un nouveau produit
	 * @param p
	 */
	public void createProduitService(Produit p);
	
	
	/**
	 * M�thode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduitService(Produit p);
	
	
	/**
	 * M�thode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduitService(int id);
	
	/** R�cup�rer tous les produits � partir d'une Categorie
	 * 
	 * @param cat
	 * @return
	 */
	public List<Produit> getProduitByCategorieDao(Categorie cat);
}
