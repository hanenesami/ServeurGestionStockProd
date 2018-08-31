package web.com.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.com.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {


}
