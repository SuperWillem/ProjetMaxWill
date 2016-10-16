package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireDao {
	
	/**
	 * Méthode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGests();
	
	
	/**
	 * Méthode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProds();
	
	
	/**
	 * Méthode pour créer un nouveau produit
	 * @param p
	 */
	public void createProduit(Produit p);
	
	
	/**
	 * Méthode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduit(Produit p);
	
	
	/**
	 * Méthode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduit(int id);
	
	
}
