package it_1.employees;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tools.IntelliJIDEA;

public class Dev<T extends IntelliJIDEA> extends Employee<T> {

    public Dev(T tool, Release release, MeetingCalendar meetingCalendar) {
        super("Developer", tool, release, meetingCalendar);
    }
}




