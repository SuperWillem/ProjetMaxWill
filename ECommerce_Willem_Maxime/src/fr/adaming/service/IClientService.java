package fr.adaming.service;

import java.util.List;

import javax.ejb.Local;

import fr.adaming.model.Client;
import fr.adaming.model.Produit;

@Local
public interface IClientService {

	/** Récupération de tous les clients
	 * 
	 * @return
	 */
	public List<Client> getAllClientService();
	
	/** Création du client dans la base de donnée
	 * 
	 * @param cl
	 */
	public void createClientService(Client cl);
	
	/** Modification d'un client existant
	 * 
	 * @param cl
	 */
	public void modifierClientService(Client cl);
	
	/** Supprimer un client de la base de donnée
	 * 
	 * @param cl
	 */
	public void supprimerClientService(Client cl);
	
	/** Récupérer un client à partir de son id
	 * 
	 * @param id
	 * @return
	 */
	public Client getClientByIdService(int id);
	
	public List<Produit> getAllProduitService();
	/** Récupérer tous les produits pour le client
	 * 
	 * 
	 * @return liste des produits
	 */

}
