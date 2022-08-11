package com.it_2.employees;

import com.it_2.tasks.Task;
import com.it_2.tools.DocumentationTools;

public class ManualQA<T extends DocumentationTools> extends Employee<T> {
    public ManualQA(String jobTitle, T tool) {
        super(jobTitle, tool);
    }

    @Override
    public void tasksHandling(Task task) {
        System.out.println(getJobTitle() + " tests new feature for " + task.getName() + ".");
        task.takeProgress(getTool().getProgress());
    }
}
