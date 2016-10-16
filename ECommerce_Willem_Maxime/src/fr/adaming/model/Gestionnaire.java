package fr.adaming.model;

import java.io.Serializable;

public class Gestionnaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	private int id_gest;
	private String nom;
	private String mdp;
	
	
	/**
	 * Constructeur sans paramètre
	 */
	public Gestionnaire() {
		super();
	}


	/**
	 * Constructeur avec paramètres sans id
	 * @param nom
	 * @param mdp
	 */
	public Gestionnaire(String nom, String mdp) {
		super();
		this.nom = nom;
		this.mdp = mdp;
	}


	/**
	 * Constructeur avec paramètres avec id
	 * @param id_gest
	 * @param nom
	 * @param mdp
	 */
	public Gestionnaire(int id_gest, String nom, String mdp) {
		super();
		this.id_gest = id_gest;
		this.nom = nom;
		this.mdp = mdp;
	}


	/**
	 * @return the id
	 */
	public int getId_gest() {
		return id_gest;
	}


	/**
	 * @param id the id to set
	 */
	public void setId_gest(int id_gest) {
		this.id_gest = id_gest;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}


	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gestionnaire [id_gest=" + id_gest + ", nom=" + nom + ", mdp=" + mdp + "]";
	}
	
	
	
	
	
}
