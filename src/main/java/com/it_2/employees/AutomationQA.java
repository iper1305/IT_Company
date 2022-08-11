package com.it_2.employees;

import com.it_2.tasks.Task;
import com.it_2.tools.Java;

public class AutomationQA<T extends Java> extends Employee<T> {
    public AutomationQA(String jobTitle, T tool) {
        super(jobTitle, tool);
    }

    @Override
    public void tasksHandling(Task task) {
        System.out.println(getJobTitle() + " tests new feature for " + task.getName() + ".");
        task.takeProgress(getTool().getProgress());
    }
}