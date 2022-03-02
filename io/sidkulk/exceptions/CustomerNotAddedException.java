package io.sidkulk.exceptions;

public class CustomerNotAddedException extends RuntimeException {
    private String message;

    public CustomerNotAddedException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
