package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table
public class Categorie implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_cat;
	private String nom;
	private String description;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		      name="prod_cat",
		      joinColumns=@JoinColumn(name="id_cat", referencedColumnName="id_cat"),
		      inverseJoinColumns=@JoinColumn(name="id_prod", referencedColumnName="id_prod"))
	private List<Produit> listeProduits;
	
	
	/**
	 * Constructeur sans paramètre
	 */
	public Categorie() {
		super();
	}


	/**
	 * Constructeur avec paramètres sans id
	 * @param nom
	 * @param description
	 */
	public Categorie(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}


	/**
	 * Constructeur avec paramètres avec id
	 * @param id_cat
	 * @param nom
	 * @param description
	 */
	public Categorie(int id_cat, String nom, String description) {
		super();
		this.id_cat = id_cat;
		this.nom = nom;
		this.description = description;
	}


	/**
	 * @return the id_cat
	 */
	public int getId_cat() {
		return id_cat;
	}


	/**
	 * @param id_cat the id_cat to set
	 */
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
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
	 * @return the listeProduits
	 */
	public List<Produit> getListeProduits() {
		return listeProduits;
	}


	/**
	 * @param listeProduits the listeProduits to set
	 */
	public void setListeProduits(List<Produit> listeProduits) {
		this.listeProduits = listeProduits;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categorie [id_cat=" + id_cat + ", nom=" + nom + ", description=" + description + "]";
	}
	
	
	
}
