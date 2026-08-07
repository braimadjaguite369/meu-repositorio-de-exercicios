public class ArrayVazioException extends RuntimeException{
    public static final String ERROARRAYVAZIO = "ARRAY ESTÁ VAZIO!";
    public ArrayVazioException(String message) {
        super(message);
    }

    public ArrayVazioException() {
    }
}
