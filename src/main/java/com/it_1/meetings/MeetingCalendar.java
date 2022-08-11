package com.it_1.meetings;

import com.it_1.exception.BusyTime;
import com.it_1.exception.NonexistentMeeting;
import com.it_1.logs.Log;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MeetingCalendar {
    private Set<Meeting> calendar = new HashSet<>();

    public void addMeeting(Meeting meeting) {
        try {
            if(!calendar.contains(meeting)) {
                calendar.add(meeting);
                Log.info("You have successfully adding meeting");
            } else {
                throw new BusyTime();
            }
        } catch (BusyTime exception) {
            Log.error(exception.getMessage());
        }
    }

    public void cancelMeeting(Meeting meeting) {
        try {
            if(calendar.contains(meeting)) {
                calendar.remove(meeting);;
                Log.info("Meeting cancelled");
            } else {
                throw new NonexistentMeeting();
            }
        } catch (NonexistentMeeting exception) {
            Log.error(exception.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetingCalendar that = (MeetingCalendar) o;
        return calendar.equals(that.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendar);
    }

    @Override
    public String toString() {
        return "MeetingCalendar{" +
                "calendar=" + calendar +
                '}';
    }
}
