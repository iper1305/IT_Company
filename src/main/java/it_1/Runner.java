package it_1;
import it_1.functionalInterface.iCustomInterface;
import it_1.logs.Log;

public class Runner {

    public static void main(String[] args) {
        iCustomInterface iCustomInterface = () -> {
            Log.info("You are a Project Manager. You coordinate and create tasks for the team.");
        };
        iCustomInterface.display();
        new WorkProcess().work();
    }
}