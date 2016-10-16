package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public class GestionnaireDaoImpl implements IGestionnaireDao{

	EntityManager em;
	
	@Override
	public List<Gestionnaire> getAllGestsDao() {
		
		//Creer une requete
		String reqjpql="SELECT g FROM Gestionnaire AS g";
		Query queryjpql=em.createQuery(reqjpql);
		List<Gestionnaire> liste=queryjpql.getResultList();
		
		//Retourner la liste des gestionnaires
		return liste;
	}

	@Override
	public List<Produit> getAllProdsDao() {
		
		//Creer une requete
		String reqjpql="SELECT p FROM Produit AS p";
		Query queryjpql=em.createQuery(reqjpql);
		List<Produit> liste=queryjpql.getResultList();
		
		//Retourner la liste des produits
		return liste;
	}

	@Override
	public void createProduitDao(Produit p) {	
		/*
		 * 	
		 *
		String description=p.getDescription();
		double prix=p.getPrix();
		double stock=p.getStock();
		
		Produit prod1=new Produit(description, prix, stock);
		 */

		em.persist(p);
		
	}

	@Override
	public void upDateProduitDao(Produit p) {

		//Récupérer les infos de l'objet par son id
		Produit prod=em.find(Produit.class, p.getId_prod());
		
		//Modification des infos de l'objet
		prod.setDescription(p.getDescription());
		prod.setPrix(p.getPrix());
		prod.setStock(p.getStock());
		
		//Mise à jour dans la table
		em.merge(prod);
	}

	@Override
	public void deleteProduitDao(int id) {
		
		//Récupérer les infos de l'objet par son id
		Produit p=em.find(Produit.class, id);
		
		//Supprimer l'objet
		em.remove(p);
	}

}
