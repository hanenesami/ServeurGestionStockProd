package web.com;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import web.com.entity.Produit;
import web.com.entity.Role;
import web.com.entity.User;
import web.com.repository.ProduitRepository;
import web.com.repository.RoleRepository;
import web.com.repository.UserRepository;
//import web.com.util.RoleEnum;

//import web.com.repository.UserRepository;

@SpringBootApplication
public class ServeurGestionStockProdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ServeurGestionStockProdApplication.class, args);
ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("Livre", 50, 20));
		produitRepository.save(new Produit("Cahier", 200, 5.25f));
		produitRepository.save(new Produit("Stylo", 500, 2.10f));
		
		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
		
		Role roleUser = new Role("ROLE_USER");
		Role roleAdmin = new Role("ROLE_ADMIN");
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		
        UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));
		
		userRepository.save(user);
		
		User admin = new User("admin", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		
		userRepository.save(admin);
	}
}
