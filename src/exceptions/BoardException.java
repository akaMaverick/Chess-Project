package exceptions;

public class BoardException extends RuntimeException {
    public static final long serialVersionUID = 1L;
    public BoardException(String message) {
        super(message);
    }
}
