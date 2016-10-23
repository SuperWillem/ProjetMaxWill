package fr.adaming.dao;

import java.util.List;

import javax.ejb.Local;

import fr.adaming.model.Client;
import fr.adaming.model.Produit;
@Local
public interface IClientDao {
	
	/** R�cup�ration de tous les clients
	 * 
	 * @return
	 */
	public List<Client> getAllClientDao();
	
	/** Cr�ation du client dans la base de donn�e
	 * 
	 * @param cl
	 */
	public void createClientDao(Client cl);
	
	/** Modification d'un client existant
	 * 
	 * @param cl
	 */
	public void modifierClientDao(Client cl);
	
	/** Supprimer un client de la base de donn�e
	 * 
	 * @param cl
	 */
	public void supprimerClientDao(Client cl);
	
	/** R�cup�rer un client � partir de son id
	 * 
	 * @param id
	 * @return
	 */
	public Client getClientByIdDao(int id);
	
	public List<Produit> getAllProduitDao();
	/** R�cup�rer tous les produits pour le client
	 * 
	 * 
	 * @return liste des produits
	 */
}
