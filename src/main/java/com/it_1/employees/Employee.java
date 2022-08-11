package com.it_1.employees;
import com.it_1.meetings.MeetingCalendar;
import com.it_1.release.Release;

import java.util.Objects;

public abstract class Employee {
    private int experience;
    private String position;
    private Release release;
    private MeetingCalendar meetingCalendar;

    public Employee(int experience, String position, Release release, MeetingCalendar meetingCalendar) {
        this.experience = experience;
        this.position = position;
        this.release = release;
        this.meetingCalendar = meetingCalendar;
    }

    public int getExperience() {
        return experience;
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

    public void setExperience(int experience) {
        this.experience = experience;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience && Objects.equals(position, employee.position) && Objects.equals(release, employee.release) && Objects.equals(meetingCalendar, employee.meetingCalendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experience, position, release, meetingCalendar);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", position='" + position + '\'' +
                ", release=" + release +
                ", meetingCalendar=" + meetingCalendar +
                '}';
    }
}
