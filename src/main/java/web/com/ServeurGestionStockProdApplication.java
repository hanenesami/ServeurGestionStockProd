package web.com;

import java.util.ArrayList;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import web.com.entity.Produit;
import web.com.repository.ProduitRepository;

@SpringBootApplication
public class ServeurGestionStockProdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ServeurGestionStockProdApplication.class, args);
	    ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);

	
	produitRepository.save(new Produit("Livre", 50, 20));
	produitRepository.save(new Produit("Cahier", 200, 20));
	produitRepository.save(new Produit("Stylo", 500, 20));
	}
}
