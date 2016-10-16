package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IGestionnaireDao;
import fr.adaming.model.Categorie;
import fr.adaming.model.Gestionnaire;
import fr.adaming.model.Produit;

public class GestionnaireServiceImpl implements IGestionnaireService{

	IGestionnaireDao gestdao;
	
	@Override
	public List<Gestionnaire> getAllGestsService() {
		List<Gestionnaire> liste=gestdao.getAllGestsDao();
		return liste;
	}

	@Override
	public List<Produit> getAllProdsService() {
		List<Produit> liste=gestdao.getAllProdsDao();
		return liste;
	}

	@Override
	public void createProduitService(Produit p) {
		gestdao.createProduitDao(p);
		
	}

	@Override
	public void upDateProduitService(Produit p) {
		gestdao.upDateProduitDao(p);
		
	}

	@Override
	public void deleteProduitService(int id) {
		gestdao.deleteProduitDao(id);
		
	}

	@Override
	public List<Produit> getProduitByCategorieDao(Categorie cat) {
	return gestdao.getProduitByCategorieDao(cat);
	}

}
