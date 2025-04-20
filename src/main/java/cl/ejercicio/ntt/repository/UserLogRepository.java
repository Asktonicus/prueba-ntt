package cl.ejercicio.ntt.repository;

import cl.ejercicio.ntt.model.UserLogModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserLogRepository extends JpaRepository<UserLogModel, UUID> {

    Page<UserLogModel> findByUserModel_Id(UUID userId, Pageable pageable);


}
