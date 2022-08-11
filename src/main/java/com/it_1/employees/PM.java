package com.it_1.employees;
import com.it_1.meetings.Cancelable;
import com.it_1.meetings.Createble;
import com.it_1.meetings.Meeting;
import com.it_1.meetings.MeetingCalendar;
import com.it_1.release.Addable;
import com.it_1.release.Changeable;
import com.it_1.release.Release;
import com.it_1.tasks.Task;

public class PM extends Employee implements Addable, Changeable, Createble, Cancelable {

    public PM(int experience, String position, Release release, MeetingCalendar meetingCalendar) {
        super(experience, position, release, meetingCalendar);
    }

    @Override
    public void addTask(Task task) {
        getRelease().addTasks(task);
    }

    @Override
    public void changeTaskName(Task task, String NewName) {
        getRelease().editTaskName(task, NewName);
    }

    @Override
    public void changeTaskDescription(Task task, String description) {
        getRelease().editTaskDescription(task, description);
    }

    @Override
    public void addMeeting(Meeting meeting) {
        getMeetingCalendar().addMeeting(meeting);
    }

    @Override
    public void cancelMeeting(Meeting meeting) {
        getMeetingCalendar().cancelMeeting(meeting);
    }
}
