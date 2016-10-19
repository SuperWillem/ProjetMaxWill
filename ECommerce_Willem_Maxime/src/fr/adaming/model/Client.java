package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// ===================================================== Attributs =============================================
	
	
	
	private int id_client;
	private String nom;
	private String adresse;
	private String email;
	private long tel;
	
	
	private List<Commande> listeCommande;
	
	// ===================================================== Constructeurs =============================================
	
	/** Empty Constructeur
	 * 
	 */
	public Client() {
		super();
	}
	
	/** Constructeur avec parametres sans id
	 * 
	 * @param nom
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public Client(String nom, String adresse, String email, long tel) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	
	/** Constructeur avec paramètre avec id
	 * 
	 * @param id_client
	 * @param nom
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public Client(int id_client, String nom, String adresse, String email, long tel) {
		super();
		this.id_client = id_client;
		this.nom = nom;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}

	
	// ===================================================== Getters et Setters =============================================
	
	
	
	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public List<Commande> getListeCommande() {
		return listeCommande;
	}

	public void setListeCommande(List<Commande> listeCommande) {
		this.listeCommande = listeCommande;
	}

	
	// ===================================================== Méthodes =============================================
	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", nom=" + nom + ", adresse=" + adresse + ", email=" + email
				+ ", tel=" + tel + "]";
	}
	
	
	
	
	

}