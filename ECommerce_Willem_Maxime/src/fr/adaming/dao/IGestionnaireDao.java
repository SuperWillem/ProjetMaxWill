package fr.adaming.dao;

import java.util.List;
import fr.adaming.model.Categorie;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireDao {
	
	/**
	 * M�thode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGestsDao();
	
	
	/**
	 * M�thode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProdsDao();
	
	
	/**
	 * M�thode pour cr�er un nouveau produit
	 * @param p
	 */
	public void createProduitDao(Produit p);
	
	
	/**
	 * M�thode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduitDao(Produit p);
	
	
	/**
	 * M�thode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduitDao(int id);
	
	
	/** R�cup�rer tous les produits � partir d'une Categorie
	 * 
	 * @param cat
	 * @return
	 */
	public List<Produit> getProduitByCategorieDao(Categorie cat);
	
}
