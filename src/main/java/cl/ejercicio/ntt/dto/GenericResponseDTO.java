package cl.ejercicio.ntt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO {

    @JsonProperty(value = "id")
    private UUID id;
    @JsonProperty(value = "creado")
    private LocalDateTime created;
    @JsonProperty(value = "modificado")
    private LocalDateTime modified;
    @JsonProperty(value = "ultimoLogin")
    private LocalDateTime lastLogin;
    @JsonProperty(value = "token")
    private String token;
    @JsonProperty(value = "activo")
    private boolean isActive;

}
