package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;

public class ClientServiceImpl implements IClientService{
	
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

}
