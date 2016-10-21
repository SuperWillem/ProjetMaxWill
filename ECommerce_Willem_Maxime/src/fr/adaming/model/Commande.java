package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_com;
	private Date dateCommande;
	
	@OneToMany(mappedBy="commande",cascade=CascadeType.REMOVE, fetch=FetchType.LAZY)
	private List<LigneDeCommande> listeLignesDeCommande;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Client client;
	
	/**
	 * Constructeur sans paramètre
	 */
	public Commande() {
		super();
	}


	/**
	 * Constructeur avec paramètres sans id
	 * @param dateCommande
	 */
	public Commande(Date dateCommande) {
		super();
		this.dateCommande = dateCommande;
	}


	/**
	 * Constructeur avec paramètres avec id
	 * @param id_com
	 * @param dateCommande
	 */
	public Commande(int id_com, Date dateCommande) {
		super();
		this.id_com = id_com;
		this.dateCommande = dateCommande;
	}


	/**
	 * @return the id_com
	 */
	public int getId_com() {
		return id_com;
	}


	/**
	 * @param id_com the id_com to set
	 */
	public void setId_com(int id_com) {
		this.id_com = id_com;
	}


	/**
	 * @return the dateCommande
	 */
	public Date getDateCommande() {
		return dateCommande;
	}


	/**
	 * @param dateCommande the dateCommande to set
	 */
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}


	/**
	 * @return the listeLignesDeCommande
	 */
	public List<LigneDeCommande> getListeLignesDeCommande() {
		return listeLignesDeCommande;
	}


	/**
	 * @param listeLignesDeCommande the listeLignesDeCommande to set
	 */
	public void setListeLignesDeCommande(List<LigneDeCommande> listeLignesDeCommande) {
		this.listeLignesDeCommande = listeLignesDeCommande;
	}


	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}


	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commande [id_com=" + id_com + ", dateCommande=" + dateCommande + "]";
	}
	
	
}
