package com.it_1;

import com.it_1.employees.Dev;
import com.it_1.employees.PM;
import com.it_1.employees.QA;
import com.it_1.meetings.Meeting;
import com.it_1.meetings.MeetingCalendar;
import com.it_1.release.Release;
import com.it_1.tasks.Design;
import com.it_1.tasks.Development;
import com.it_1.tasks.Testing;
import com.it_1.employees.Designer;

public class Runner {
    public static void main(String[] args) {
        Release release = new Release();
        MeetingCalendar meetingCalendar = new MeetingCalendar();
        PM ivan = new PM(3, "Product manager", release, meetingCalendar);
        Dev dmytro = new Dev(2, "Lead", release, meetingCalendar);
        QA oleg = new QA(1, "QA manual", release, meetingCalendar);
        Designer alla = new Designer(2, "Designer", release, meetingCalendar);

        Development createNewFeature = new Development(2008, "User managment",
                "Create function for adding new user", "https://github.com", 2);
        Design redesignApp = new Design(2009, "Add new element for login page",
                "Change tooltip for login page", "https://www.figma.com/",
                "Mailchimp Design System");
        Testing makeTest = new Testing(2010, "Testing user management functionality",
                "Test for creating new user",  "79%", "manual");

        Meeting meeting = new Meeting("14.00", "User managment", "1 August");

        ivan.addTask(createNewFeature);
        ivan.addTask(redesignApp);
        ivan.addTask(makeTest);

        dmytro.finishTask(createNewFeature);
        oleg.finishTask(makeTest);
        alla.finishTask(redesignApp);
        dmytro.addMeeting(meeting);
    }
}
