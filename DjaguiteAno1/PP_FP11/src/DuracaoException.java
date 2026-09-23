public class DuracaoException extends RuntimeException {
    public static final String ERRO_DURACAO = "DURAÇÃO INVÁLIDA";

    public DuracaoException(String message) {
        super(message);
    }
}
