package by.epam.task1.exeption;

public class FileIsNotReadExeption extends RuntimeException {
    public FileIsNotReadExeption(String message, Throwable cause){
        super(message, cause);
    }
}
