package by.epam.task1.exeption;

public class FileIsNotExistException extends Exception {
    public FileIsNotExistException(String message, Throwable cause){
        super(message, cause);
    }
}
