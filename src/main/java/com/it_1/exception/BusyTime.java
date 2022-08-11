package com.it_1.exception;

public class BusyTime extends Exception {

    public BusyTime() {
        super("BusyTime time.");
    }

    public BusyTime(String message) {
        super(message);
    }

    public BusyTime(String message, Throwable cause) {
        super(message, cause);
    }

    public BusyTime(Throwable cause) {
        super(cause);
    }
}
