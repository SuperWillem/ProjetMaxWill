package fr.adaming.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;
import fr.adaming.model.Produit;

@Stateless
public class ClientServiceImpl implements IClientService{
	
	@EJB
	private IClientDao clientDao;

	@Override
	public List<Client> getAllClientService() {
		return clientDao.getAllClientDao();
	}

	@Override
	public void createClientService(Client cl) {
		clientDao.createClientDao(cl);
		
	}

	@Override
	public void modifierClientService(Client cl) {
		clientDao.modifierClientDao(cl);
		
	}

	@Override
	public void supprimerClientService(Client cl) {
		clientDao.supprimerClientDao(cl);
		
	}

	@Override
	public Client getClientByIdService(int id) {
		return clientDao.getClientByIdDao(id);
	}

	@Override
	public List<Produit> getAllProduitService() {
		return clientDao.getAllProduitDao();
	}

}
