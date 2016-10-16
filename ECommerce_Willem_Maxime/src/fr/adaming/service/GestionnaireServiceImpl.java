package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IGestionnaireDao;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public class GestionnaireServiceImpl implements IGestionnaireService{

	IGestionnaireDao gestdao;
	
	@Override
	public List<Gestionnaire> getAllGestsService() {
		List<Gestionnaire> liste=gestdao.getAllGests();
		return liste;
	}

	@Override
	public List<Produit> getAllProdsService() {
		List<Produit> liste=gestdao.getAllProds();
		return liste;
	}

	@Override
	public void createProduitService(Produit p) {
		gestdao.createProduit(p);
		
	}

	@Override
	public void upDateProduitService(Produit p) {
		gestdao.upDateProduit(p);
		
	}

	@Override
	public void deleteProduitService(int id) {
		gestdao.deleteProduit(id);
		
	}

}
