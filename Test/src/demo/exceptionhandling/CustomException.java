package demo.exceptionhandling;

public class CustomException extends Exception {

    public CustomException(String errorMessage){
        super(errorMessage);
    }

    public CustomException(String message, Throwable cause){
        super(message,cause);
    }

    public CustomException(String message, Exception exception){
        super(message,exception);
    }

}
