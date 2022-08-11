package com.it_2.employees;

import com.it_2.tasks.Task;
import com.it_2.tools.Tools;

import java.util.Objects;

public abstract class Employee<T extends Tools> {
    private String jobTitle;
    private T tool;
    public Employee(String jobTitle, T tool) {
        this.jobTitle = jobTitle;
        this.tool = tool;
    }

    public abstract void tasksHandling(Task task);

    public String getJobTitle() {
        return jobTitle;
    }

    public T getTool() {
        return tool;
    }

    public void setTool(T tool) {
        this.tool = tool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee<?> employee = (Employee<?>) o;
        return Objects.equals(jobTitle, employee.jobTitle) && Objects.equals(tool, employee.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTitle, tool);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", tool=" + tool +
                '}';
    }
}
