package cl.ejercicio.ntt.exception;

public class EmailExistException extends RuntimeException {

    public EmailExistException(String msg) {
        super(msg);
    }
}
