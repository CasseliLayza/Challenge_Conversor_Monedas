package main.java.com.backend.challengeconversormonedas.exception;

public class FailRequestException extends RuntimeException {
    public FailRequestException(String message) {
        super(message);
    }
}
