package fr.adaming.model;

import java.io.Serializable;

public class LigneDeCommande implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	private int id_ldc;
	private double quantite;
	private double prix;
	
	private Produit produit;
	private Commande commande;
	
	
	/**
	 * Constructeur sans paramètre
	 */
	public LigneDeCommande() {
		super();
	}


	/**
	 * Constructeur avec paramètres sans id
	 * @param quantite
	 * @param prix
	 */
	public LigneDeCommande(double quantite, double prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}


	/**
	 * Constructeur avec paramètres avec id
	 * @param id_ldc
	 * @param quantite
	 * @param prix
	 */
	public LigneDeCommande(int id_ldc, double quantite, double prix) {
		super();
		this.id_ldc = id_ldc;
		this.quantite = quantite;
		this.prix = prix;
	}


	/**
	 * @return the id_ldc
	 */
	public int getId_ldc() {
		return id_ldc;
	}


	/**
	 * @param id_ldc the id_ldc to set
	 */
	public void setId_ldc(int id_ldc) {
		this.id_ldc = id_ldc;
	}


	/**
	 * @return the quantite
	 */
	public double getQuantite() {
		return quantite;
	}


	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(double quantite) {
		this.quantite = quantite;
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
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}


	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	
	/**
	 * @return the commande
	 */
	public Commande getCommande() {
		return commande;
	}


	/**
	 * @param commande the commande to set
	 */
	public void setCommande(Commande commande) {
		this.commande = commande;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LigneDeCommande [id_ldc=" + id_ldc + ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	
	
}
