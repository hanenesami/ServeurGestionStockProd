package web.com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import web.com.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService {

	public ProduitMockServiceImpl(){
		produits=new ArrayList<Produit>();
		produits.add(new Produit("Livre", 50, 20));
		produits.add(new Produit("Cahier", 200, 20));
		produits.add(new Produit("Stylo", 500, 20));
		
	}
	private List<Produit> produits;
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
		
	}

	@Override
	public void saveAll(Iterable<User> iterable) {
		// TODO Auto-generated method stub
		
	}

}
