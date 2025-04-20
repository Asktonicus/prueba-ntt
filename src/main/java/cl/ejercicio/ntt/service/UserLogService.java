package cl.ejercicio.ntt.service;

import cl.ejercicio.ntt.dto.log.UserLogDTO;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface UserLogService {

    Page<UserLogDTO> getAllLog(Integer page, Integer size, UUID userId);

}
