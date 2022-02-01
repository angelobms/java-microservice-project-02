package br.com.bmsti.hrmsuser.repositories;

import br.com.bmsti.hrmsuser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);

}
