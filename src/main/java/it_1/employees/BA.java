package it_1.employees;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tools.Confluence;

public class BA<T extends Confluence> extends Employee<T> {

    public BA(T tool, Release release, MeetingCalendar meetingCalendar) {
        super("Business Analytic", tool, release, meetingCalendar);
    }
}
