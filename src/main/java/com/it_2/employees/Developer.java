package com.it_2.employees;

import com.it_2.tasks.Task;
import com.it_2.tools.iJava;

public class Developer<T extends iJava> extends Employee<T> {
    public Developer(String jobTitle, T tool) {
        super(jobTitle, tool);
    }

    @Override
    public void tasksHandling(Task task) {
        System.out.println(getJobTitle() + " develops feature for " + task.getName() + ".");
        task.takeProgress(getTool().getProgress());
    }
}
