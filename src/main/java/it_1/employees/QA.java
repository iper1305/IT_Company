package it_1.employees;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tools.XRay;

public class QA<T extends XRay> extends Employee<T> {

    public QA(T tool, Release release, MeetingCalendar meetingCalendar) {
        super("Quality Assurance Engineer", tool, release, meetingCalendar);
    }
}
