package fr.adaming.ManagedBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import fr.adaming.model.Client;
import fr.adaming.model.Produit;
import fr.adaming.service.IClientService;

@ManagedBean(name="clientMB")
@SessionScoped
public class ClientManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Client client;
	
	private HttpSession session;

	private List<Produit> listProduit;
	
	@EJB
	private IClientService clientServ;
	
	
	@PostConstruct
	public void init(){
		session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		this.client = (Client) session.getAttribute("client");
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public IClientService getClientServ() {
		return clientServ;
	}


	public void setClientServ(IClientService clientServ) {
		this.clientServ = clientServ;
	}

	public List<Produit> getListProduit() {
		return listProduit;
	}


	public void setListProduit(List<Produit> listProduit) {
		this.listProduit = listProduit;
	}
	
	
	public String initialisation(){
		
		
		return "acceuilClient.xhtml";
	}
	

}
