package cl.ejercicio.ntt.exception;

import cl.ejercicio.ntt.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex) {
        String msg = ex.getBindingResult().getFieldErrors().stream()
                .map(err -> err.getDefaultMessage())
                .findFirst()
                .orElse(Constants.VALIDATION_ERROR);

        return ResponseEntity.badRequest().body(Map.of(Constants.MSG, msg));
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, String>> handleEmptyRequestBody(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(Map.of(Constants.MSG, Constants.BODY_CANT_EMPTY));
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<Map<String, String>> handleValidationException(ValidationException ex) {
        return ResponseEntity.badRequest().body(Map.of(Constants.MSG, ex.getMessage()));
    }

    @ExceptionHandler(EmailExistException.class)
    public ResponseEntity<Map<String, String>> handleEmailExistException(EmailExistException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Map.of(Constants.MSG, ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleAllOtherExceptions(Exception ex) {
        log.error("Error: ", ex);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(Constants.MSG, Constants.INTERNAL_SERVER));
    }
}
