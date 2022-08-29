package it_1.pool;

import it_1.logs.Log;

class SomeThread implements Runnable {
    private String message;

    public SomeThread(String s) {
        this.message = s;
    }

    public void run() {
        Log.info(Thread.currentThread().getName() + " start = " + message);
        processmessage();
        System.out.println(Thread.currentThread().getName() + " finish");
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}