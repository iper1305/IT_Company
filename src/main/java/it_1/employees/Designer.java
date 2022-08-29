package it_1.employees;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tools.Figma;

public class Designer<T extends Figma> extends Employee<T> {

    public Designer(T tool, Release release, MeetingCalendar meetingCalendar) {
        super("Designer", tool, release, meetingCalendar);
    }
}
