package by.training.epam.service.exception;

public class ServiceException extends Exception {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException() {
        super();
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
