package it_1;

import it_1.employees.*;
import it_1.logs.Log;
import it_1.meetings.Meeting;
import it_1.meetings.MeetingCalendar;
import it_1.release.Release;
import it_1.tasks.Tasks;
import it_1.tools.*;

import java.util.*;

public class WorkProcess {
    private final Release RELEASE = new Release();
    private final MeetingCalendar MEETING_CALENDAR = new MeetingCalendar();
    private final List<Employee> TEAM_MEMBERS =
            new ArrayList<>(Arrays.asList(new PM(new GoogleAnalytics(), RELEASE, MEETING_CALENDAR),
                    new BA(new Confluence(), RELEASE, MEETING_CALENDAR), new Designer(new Figma(), RELEASE, MEETING_CALENDAR),
                    new Dev(new IntelliJIDEA(), RELEASE, MEETING_CALENDAR), new QA(new XRay(), RELEASE, MEETING_CALENDAR)));
    private List<Integer> tasksQuantity = new ArrayList<>();

    public void showTeamMember() {
        Log.info("Your team include next specialist: ");
        TEAM_MEMBERS.stream()
                .map(Employee::getPosition)
                .forEach(System.out::println);
    }

    private int getNumber(String position) {
        Log.info("You need to create tasks for your team." +
                " How many tasks for " + position + " will be in release?");
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            Log.error("You entered incorrect data. Try again.");
            number = getNumber(position);
        }
        if (number <= 0) {
            Log.error("You entered incorrect data. The minimum number is 1. Try again.");
            number = getNumber(position);
        }
        return number;
    }

    private boolean isMeeting(String message) {
        Log.info("Do you want to " + message + " meeting? Accepted answer: yes or no.");
        Scanner scan = new Scanner(System.in);
        String userResponse = scan.nextLine().toLowerCase();
        if (Objects.equals(userResponse, "yes")) {
            return true;
        } else if (Objects.equals(userResponse, "no")) {
            return false;
        } else {
            System.out.println("You entered incorrect data. Try again.");
            return isMeeting(message);
        }
    }

    private String addMeetingDetails(String detail) {
        System.out.println("Enter meeting " + detail);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private void addMeetingInCalendar() {
        while (isMeeting("create")) {
            TEAM_MEMBERS.get(0).addMeeting(new Meeting(addMeetingDetails("time"), addMeetingDetails("date"),
                    addMeetingDetails("topic")));
        }
    }

    private void cancelMeetingInCalendar() {
        if (MEETING_CALENDAR.getCalendar().size() > 0) {
            while (isMeeting("cancel")) {
                TEAM_MEMBERS.get(0).cancelMeeting(new Meeting(addMeetingDetails("time"), addMeetingDetails("date"),
                        addMeetingDetails("topic")));
            }
        }
    }

    private List<Integer> getTaskQuantity() {
        for (int i = 1; i < TEAM_MEMBERS.size(); i++) {
            tasksQuantity.add(getNumber(TEAM_MEMBERS.get(i).getPosition()));
        }
        return tasksQuantity;
    }

    private void buildRelease() {

        for (int i = 0; i < tasksQuantity.get(0); i++) {
            TEAM_MEMBERS.get(0).addTask(Tasks.ANALYSIS);
        }

        for (int i = 0; i < tasksQuantity.get(1); i++) {
            TEAM_MEMBERS.get(0).addTask(Tasks.DESIGN);
        }

        for (int i = 0; i < tasksQuantity.get(2); i++) {
            TEAM_MEMBERS.get(0).addTask(Tasks.DEVELOPMENT);
        }

        for (int i = 0; i < tasksQuantity.get(3); i++) {
            TEAM_MEMBERS.get(0).addTask(Tasks.TESTING);
        }

        for (int i = 0; i < tasksQuantity.size(); i++) {
            Log.info("You have successfully adding " + tasksQuantity.get(i) + " tasks for "
                    + TEAM_MEMBERS.get(i + 1).getPosition());
        }
    }

    private void closeRelease() {
        while (RELEASE.existTasks(Tasks.ANALYSIS)) {
            TEAM_MEMBERS.get(1).finishTask(Tasks.ANALYSIS);
        }

        while (RELEASE.existTasks(Tasks.DESIGN)) {
            TEAM_MEMBERS.get(2).finishTask(Tasks.DESIGN);
        }

        while (RELEASE.existTasks(Tasks.DEVELOPMENT)) {
            TEAM_MEMBERS.get(3).finishTask(Tasks.DEVELOPMENT);
        }

        while (RELEASE.existTasks(Tasks.TESTING)) {
            TEAM_MEMBERS.get(4).finishTask(Tasks.TESTING);
        }

        for (int i = 0; i < tasksQuantity.size(); i++) {
            Log.info(TEAM_MEMBERS.get(i + 1).getPosition() + " " + TEAM_MEMBERS.get(i + 1).getTool()
                    + " successfully finished with " + tasksQuantity.get(i) + " tasks");
        }
    }

    public void work() {
        showTeamMember();
        getTaskQuantity();
        buildRelease();
        closeRelease();
        addMeetingInCalendar();
        cancelMeetingInCalendar();
    }
}
