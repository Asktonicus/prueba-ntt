package cl.ejercicio.ntt.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {

    @JsonProperty(value = "nombre")
    @NotBlank(message = "El nombre es obligatorio")
    private String name;
    @JsonProperty(value = "correo")
    @NotBlank(message = "El email es obligatorio")
    private String email;
    @JsonProperty(value = "contraseña")
    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String passwd;
    @JsonProperty(value = "telefonos")
    @NotEmpty(message = "Debe incluir al menos un teléfono")
    private List<PhoneDTO> phoneList;

}
