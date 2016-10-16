package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Categorie;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireService {

	/**
	 * Méthode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGestsService();
	
	
	/**
	 * Méthode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProdsService();
	
	
	/**
	 * Méthode pour créer un nouveau produit
	 * @param p
	 */
	public void createProduitService(Produit p);
	
	
	/**
	 * Méthode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduitService(Produit p);
	
	
	/**
	 * Méthode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduitService(int id);
	
	/** Récupérer tous les produits à partir d'une Categorie
	 * 
	 * @param cat
	 * @return
	 */
	public List<Produit> getProduitByCategorieDao(Categorie cat);
}
