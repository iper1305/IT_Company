package it_1.employees;
import it_1.meetings.Cancelable;
import it_1.meetings.Createble;
import it_1.meetings.Meeting;
import it_1.meetings.MeetingCalendar;
import it_1.release.Addable;
import it_1.release.Closable;
import it_1.release.Release;
import it_1.tasks.Tasks;
import java.util.Objects;

public class Employee <T> implements Addable, Createble, Cancelable, Closable {
    private String position;
    private T tool;
    private Release release;
    private MeetingCalendar meetingCalendar;

    public Employee(String position, T tool, Release release, MeetingCalendar meetingCalendar) {
        this.position = position;
        this.tool = tool;
        this.release = release;
        this.meetingCalendar = meetingCalendar;
    }

    @Override
    public void addTask(Tasks task) {
        getRelease().addTasks(task);
    }

    @Override
    public void finishTask(Tasks task) {
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

    public T getTool() {
        return tool;
    }

    public String getPosition() {
        return position;
    }

    public Release getRelease() {
        return release;
    }

    public MeetingCalendar getMeetingCalendar() {
        return meetingCalendar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee<?> employee = (Employee<?>) o;
        return Objects.equals(position, employee.position) && Objects.equals(tool, employee.tool) && Objects.equals(release, employee.release) && Objects.equals(meetingCalendar, employee.meetingCalendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, tool, release, meetingCalendar);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", tool=" + tool +
                ", release=" + release +
                ", meetingCalendar=" + meetingCalendar +
                '}';
    }
}
