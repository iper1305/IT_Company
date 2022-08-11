package com.it_1.exception;

public class NonexistentMeeting extends Exception {

    public NonexistentMeeting() {
        super("This meeting is not exist");
    }

    public NonexistentMeeting(String s) {
        super(s);
    }

    public NonexistentMeeting(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentMeeting(Throwable cause) {
        super(cause);
    }
}
