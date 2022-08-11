package com.it_1.employees;

import com.it_1.meetings.Createble;
import com.it_1.meetings.Cancelable;
import com.it_1.meetings.Meeting;
import com.it_1.meetings.MeetingCalendar;
import com.it_1.release.Closable;
import com.it_1.release.Release;
import com.it_1.tasks.Task;

public class DevOps extends Employee implements Closable, Createble, Cancelable {

    public DevOps(int experience, String position, Release release, MeetingCalendar meetingCalendar) {
        super(experience, position, release, meetingCalendar);
    }

    @Override
    public void finishTask(Task task) {
        getRelease().finishTask(task);
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
