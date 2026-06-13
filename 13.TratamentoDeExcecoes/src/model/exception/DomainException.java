package model.exception;

import java.io.Serial;

// Se for RuntimeException, não é necessário tratar. Mas se não for tratada o programa pode quebrar
public class DomainException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
