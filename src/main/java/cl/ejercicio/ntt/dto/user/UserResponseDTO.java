package cl.ejercicio.ntt.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private UUID id;
    @JsonProperty(value = "nombre")
    private String name;
    @JsonProperty(value = "correo")
    private String email;
    @JsonProperty(value = "telefonos")
    private List<PhoneDTO> phoneList;
    @JsonProperty(value = "creado")
    private String created;
    @JsonProperty(value = "modificado")
    private String modified;
    @JsonProperty(value = "ultimoLogin")
    private String lastLogin;
    private String token;
    @JsonProperty(value = "activo")
    private boolean isActive;

}
