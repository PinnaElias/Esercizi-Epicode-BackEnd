package it.epicode.progettoweekend.DAO;

import it.epicode.progettoweekend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);

}
