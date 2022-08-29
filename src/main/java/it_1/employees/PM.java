package it_1.employees;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tools.GoogleAnalytics;

public class PM<T extends GoogleAnalytics> extends Employee<T> {

    public PM(T tool, Release release, MeetingCalendar meetingCalendar) {
        super("Project Manager", tool, release, meetingCalendar);
    }
}
