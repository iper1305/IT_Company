package com.it_2.tasks;

public abstract class Task {
    private String name;
    private int time;

    public Task(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void takeProgress(int spentTime){
        if (isDone() && time <= spentTime) {
            time = 0;
            System.out.println(getName() + " is done.");
        } else {
            this.time -= Math.min(time, spentTime);
            System.out.println(name + " in progress");
        }

    }

    public boolean isDone() {
        return time > 0;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
