package fr.adaming.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import fr.adaming.model.Client;
import fr.adaming.model.Produit;

@Stateless
public class ClientDaoImpl implements IClientDao{

	EntityManager em;
	
	@Override
	public List<Client> getAllClientDao() {
		String reqjpql="SELECT c FROM Client AS c";
		Query queryjpql=em.createQuery(reqjpql);
		@SuppressWarnings("unchecked")
		List<Client> liste=queryjpql.getResultList();
		return liste;
	}

	@Override
	public void createClientDao(Client cl) {
		em.persist(cl);
	}

	@Override
	public void modifierClientDao(Client cl) {
		Client clu = em.find(Client.class, cl.getId_client());
		clu.setAdresse(cl.getAdresse());
		clu.setEmail(cl.getEmail());
		clu.setNom(cl.getNom());
		clu.setTel(cl.getTel());
		em.merge(clu);
		
	}

	@Override
	public void supprimerClientDao(Client cl) {
		Client clu = em.find(Client.class, cl.getId_client());
		em.remove(clu);
	}
	
	@Override
	public Client getClientByIdDao(int id) {
		return em.find(Client.class, id);
	}

	@Override
	public List<Produit> getAllProduitDao() {
		
		//Creer une requete
		String reqjpql="SELECT p FROM Produit AS p";
		Query queryjpql=em.createQuery(reqjpql);
		List<Produit> liste=queryjpql.getResultList();
		
		//Retourner la liste des produits
		return liste;
	}
}