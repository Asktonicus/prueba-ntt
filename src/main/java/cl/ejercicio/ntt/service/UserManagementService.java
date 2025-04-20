package cl.ejercicio.ntt.service;

import cl.ejercicio.ntt.dto.GenericResponseDTO;
import cl.ejercicio.ntt.dto.user.UserRequestDTO;
import cl.ejercicio.ntt.dto.user.UserResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface UserManagementService {

    GenericResponseDTO addUser(UserRequestDTO user) throws JsonProcessingException;
    UserResponseDTO getByEmail(String email);
    Page<UserResponseDTO> getAllUser(Integer page, Integer size, String sortBy, String status);
    UserResponseDTO updateUser(UUID id, UserRequestDTO user) throws JsonProcessingException;
    void deleteUser(UUID id);
    void activateUser(UUID id);
}
