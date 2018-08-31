package web.com.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String str);

}
