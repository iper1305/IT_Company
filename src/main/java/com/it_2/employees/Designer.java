package com.it_2.employees;

import com.it_2.tasks.Task;
import com.it_2.tools.LayoutTools;

public class Designer<T extends LayoutTools> extends Employee<T> {
    public Designer(String jobTitle, T tool) {
        super(jobTitle, tool);
    }

    @Override
    public void tasksHandling(Task task){
        System.out.println(getJobTitle() + " develops design for " + task.getName() + ".");
        task.takeProgress(getTool().getProgress());
    }
}
