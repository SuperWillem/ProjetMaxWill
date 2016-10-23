package fr.adaming.dao;

import java.util.List;
import fr.adaming.model.Categorie;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireDao {
	
	/**
	 * Méthode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGestsDao();
	
	
	/**
	 * Méthode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProdsDao();
	
	
	/**
	 * Méthode pour créer un nouveau produit
	 * @param p
	 */
	public void createProduitDao(Produit p);
	
	
	/**
	 * Méthode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduitDao(Produit p);
	
	
	/**
	 * Méthode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduitDao(int id);
	
	
	/**
	 * Méthode pour créer une nouvelle catégorie
	 * @param c
	 */
	public void createCategorieDao(Categorie c);
	
	
	/**
	 * Méthode de modification des infos d'une categorie
	 * @param c
	 */
	public void upDateCategorieDao(Categorie c);
	
	
	/**
	 * Méthode de suppression d'une categorie
	 * @param id
	 */
	public void deleteCategorieDao(int id);
	
	
	/** Récupérer tous les produits à partir d'une Categorie
	 * 
	 * @param cat
	 * @return
	 */
	public List<Produit> getProduitByCategorieDao(Categorie cat);
	
}
