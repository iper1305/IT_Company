package com.it_1.release;

import com.it_1.tasks.Task;

public interface Changeable {
    void changeTaskName(Task task, String NewName);

    void changeTaskDescription(Task task, String description);
}
