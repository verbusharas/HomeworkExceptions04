package lt.verbus;

public class NoNetworkException extends Exception {
    private String errorMessage;

    public NoNetworkException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
