package cl.ejercicio.ntt.repository;

import cl.ejercicio.ntt.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserManagementRepository extends JpaRepository<UserModel, UUID> {

    boolean existsByEmail(String email);
    UserModel findByEmailIgnoreCase(String email);

}
