package it_1;
import it_1.functionalInterface.CustomInterface;
import it_1.logs.Log;

public class Runner {

    public static void main(String[] args) {
        CustomInterface customInterface = () -> {
            Log.info("You are a Project Manager. You coordinate and create tasks for the team.");
        };
        customInterface.display();
        new WorkProcess().work();
    }
}