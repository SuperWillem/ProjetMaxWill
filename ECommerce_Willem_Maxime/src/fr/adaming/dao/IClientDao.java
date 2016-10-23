package fr.adaming.dao;

import java.util.List;

import javax.ejb.Local;

import fr.adaming.model.Client;
import fr.adaming.model.Produit;
@Local
public interface IClientDao {
	
	/** Récupération de tous les clients
	 * 
	 * @return
	 */
	public List<Client> getAllClientDao();
	
	/** Création du client dans la base de donnée
	 * 
	 * @param cl
	 */
	public void createClientDao(Client cl);
	
	/** Modification d'un client existant
	 * 
	 * @param cl
	 */
	public void modifierClientDao(Client cl);
	
	/** Supprimer un client de la base de donnée
	 * 
	 * @param cl
	 */
	public void supprimerClientDao(Client cl);
	
	/** Récupérer un client à partir de son id
	 * 
	 * @param id
	 * @return
	 */
	public Client getClientByIdDao(int id);
	
	public List<Produit> getAllProduitDao();
	/** Récupérer tous les produits pour le client
	 * 
	 * 
	 * @return liste des produits
	 */
}
