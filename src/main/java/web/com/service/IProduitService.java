package web.com.service;

import java.util.List;

import web.com.entity.Produit;



public interface IProduitService {

	List<Produit> getProduits();
	void addProduit(Produit produit);
	void updateProduit(Produit produit);
	void deleteProduit(Long id);
	
}
