package cl.ejercicio.ntt.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    @JsonProperty(value = "numero")
    @NotBlank(message = "El número es obligatorio")
    @Pattern(regexp = "\\d{7,10}", message = "mensaje: El número debe tener entre 7 y 10 dígitos")
    private String phoneNumber;
    @JsonProperty(value = "codigoCiudad")
    @NotBlank(message = "El código de ciudad es obligatorio")
    private String codCity;
    @JsonProperty(value = "codigoPais")
    @NotBlank(message = "El código de país es obligatorio")
    private String codCountry;

}
