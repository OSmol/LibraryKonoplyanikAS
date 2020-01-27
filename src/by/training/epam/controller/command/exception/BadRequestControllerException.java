package by.training.epam.controller.command.exception;

public class BadRequestControllerException extends Exception {

    public BadRequestControllerException(String message) {
        super(message);
    }

    public BadRequestControllerException(String message, Throwable cause) {
        super(message, cause);
    }

}
