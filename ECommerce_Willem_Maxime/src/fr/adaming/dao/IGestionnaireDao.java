package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public interface IGestionnaireDao {
	
	/**
	 * M�thode pour obtenir la liste de tous les gestionnaires
	 * @return
	 */
	public List<Gestionnaire> getAllGests();
	
	
	/**
	 * M�thode pour obtenir la liste de tous les produits
	 * @return
	 */
	public List<Produit> getAllProds();
	
	
	/**
	 * M�thode pour cr�er un nouveau produit
	 * @param p
	 */
	public void createProduit(Produit p);
	
	
	/**
	 * M�thode de modification des infos d'un produit
	 * @param p
	 */
	public void upDateProduit(Produit p);
	
	
	/**
	 * M�thode de suppression d'un produit
	 * @param id
	 */
	public void deleteProduit(int id);
	
	
}
