package com.it_1.release;
import com.it_1.exception.NonexistentTask;
import com.it_1.tasks.Task;
import com.it_1.logs.Log;

import java.util.*;


public class Release {
    private Map<String, Task> release = new HashMap<>();

    public void addTasks(Task task) {
        release.put(task.getName(), task);
        Log.info("You have successfully adding task for " + "'" + task.getName() + "'");
    }

    public void finishTask(Task task) {
        try {
            if (release.containsKey(task.getName())) {
                release.remove(task.getName(), task);
                Log.info("You have successfully finished with task for " + "'" + task.getName() + "'");
            } else {
                throw new NonexistentTask();
            }
        } catch (NonexistentTask exception) {
            Log.error(exception.getMessage());
        }
    }

    public void editTaskName(Task task, String name) {
        try {
            if(release.containsKey(task.getName())) {
                release.get(task.getName()).setName(name);
                Log.info("You have successfully changed name to " + "'" + name + "'" + " for this task");
            } else {
                throw new NonexistentTask();
            }
        } catch (NonexistentTask exception) {
            Log.error(exception.getMessage());
        }
    }

    public void editTaskDescription(Task task, String description) {
        try {
            if(release.containsKey(task.getName())) {
                release.get(task.getName()).setDescription(description);
                Log.info("You have successfully changed name to " + "'" + description + "'" + " for this task");
            } else {
                throw new NonexistentTask();
            }
        } catch (NonexistentTask exception) {
            Log.error(exception.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Release)) return false;
        Release release = (Release) o;
        return Objects.equals(release, release.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(release);
    }

    @Override
    public String toString() {
        return "Release{" +
                "realease=" + release +
                '}';
    }
}
