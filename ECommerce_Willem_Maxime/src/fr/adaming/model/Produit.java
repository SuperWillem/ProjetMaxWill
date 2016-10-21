package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import fr.adaming.model.Categorie;

@Entity
@Table
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_prod;
	
	private String description;
	private double prix;
	private double stock;
	
	@OneToMany
	private List<LigneDeCommande> ligneDeCommande;
	
	@ManyToMany(mappedBy="listeProduits", fetch = FetchType.LAZY)
	private List<Categorie> listeCategories;
	
	/**
	 * Constructeur sans paramètre
	 */
	public Produit() {
		super();
	}


	/**
	 * Constructeur avec paramètres sans id
	 * @param description
	 * @param prix
	 * @param stock
	 */
	public Produit(String description, double prix, double stock) {
		super();
		this.description = description;
		this.prix = prix;
		this.stock = stock;
	}


	/**
	 * Constructeur avec paramètres avec id
	 * @param id_prod
	 * @param description
	 * @param prix
	 * @param stock
	 */
	public Produit(int id_prod, String description, double prix, double stock) {
		super();
		this.id_prod = id_prod;
		this.description = description;
		this.prix = prix;
		this.stock = stock;
	}


	/**
	 * @return the id_prod
	 */
	public int getId_prod() {
		return id_prod;
	}


	/**
	 * @param id_prod the id_prod to set
	 */
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}


	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}


	/**
	 * @return the stock
	 */
	public double getStock() {
		return stock;
	}


	/**
	 * @param stock the stock to set
	 */
	public void setStock(double stock) {
		this.stock = stock;
	}
	
	

	/**
	 * @return the ligneDeCommande
	 */
	public List<LigneDeCommande> getLigneDeCommande() {
		return ligneDeCommande;
	}


	/**
	 * @param ligneDeCommande the ligneDeCommande to set
	 */
	public void setLigneDeCommande(List<LigneDeCommande> ligneDeCommande) {
		this.ligneDeCommande = ligneDeCommande;
	}
	
	

	/**
	 * @return the listeCategories
	 */
	public List<Categorie> getListeCategories() {
		return listeCategories;
	}


	/**
	 * @param listeCategories the listeCategories to set
	 */
	public void setListeCategories(List<Categorie> listeCategories) {
		this.listeCategories = listeCategories;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Produit [id_prod=" + id_prod + ", description=" + description + ", prix=" + prix + ", stock=" + stock
				+ "]";
	}
	
	
}
