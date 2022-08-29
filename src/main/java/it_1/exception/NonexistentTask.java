package it_1.exception;

public class NonexistentTask extends Exception{

    public NonexistentTask() {
        super("Non existent Task");
    }

    public NonexistentTask(String s) {
        super(s);
    }

    public NonexistentTask(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentTask(Throwable cause) {
        super(cause);
    }
}
