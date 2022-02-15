package workstation.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import workstation.pro.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	User findByEmail(String email);
}
