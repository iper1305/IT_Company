package com.it_2;
import com.it_2.employees.Designer;
import com.it_2.employees.*;
import com.it_2.employees.AutomationQA;
import com.it_2.employees.Developer;
import com.it_2.employees.ManualQA;
import com.it_2.tasks.Design;
import com.it_2.tasks.Development;
import com.it_2.tasks.Task;
import com.it_2.tasks.Testing;
import com.it_2.tools.Figma;
import com.it_2.tools.InteliJIDEA;
import com.it_2.tools.XRay;

import java.util.*;

public class WorkProcess {

    public static void workingProcessForDesigner() {
        List<Designer> designers = buildDesignDepartment();
        List<Task> designersTasks = buildDesignTaskScope();

        for (int j = 0; j < designers.size(); j++) {
            for (int i = 0; i < designersTasks.size(); i++) {
                if (designersTasks.get(i).getTime() > 0) {
                    designers.get(j).tasksHandling(designersTasks.get(i));
                }
            }
        }
    }

    public static void workingProcessForDevelopers() {
        List<Developer> developers = buildDeveloperDepartment();
        List<Task> developersTasks = buildDevelopmentTaskScope();

        for (int j = 0; j < developers.size(); j++) {
            for (int i = 0; i < developersTasks.size(); i++) {
                if (developersTasks.get(i).getTime() > 0) {
                    developers.get(j).tasksHandling(developersTasks.get(i));
                }
            }
        }
    }

    public static void workingProcessForQA() {
        List<Employee> QA = buildTestingDepartment();
        List<Task> QATasks = buildTestingTaskScope();

        for (int j = 0; j < QA.size(); j++) {
            for (int i = 0; i < QATasks.size(); i++) {
                if (QATasks.get(i).getTime() > 0) {
                    QA.get(j).tasksHandling(QATasks.get(i));
                }
            }
        }
    }

    private static List<Designer> buildDesignDepartment() {
        List<Designer> designers = new ArrayList<>();
        int numberOfDesigner = getNumber("Design Department", "designer");


        for (int i = 0; i < numberOfDesigner; i++) {
            designers.add(new Designer("Designer" + (i + 1), new Figma()));
        }

        return designers;
    }

    private static List<Developer> buildDeveloperDepartment() {
        List<Developer> developers = new LinkedList<>();
        int numberOfDevelopers = getNumber("Development Department", "developer");


        for (int i = 0; i < numberOfDevelopers; i++) {
            developers.add(new Developer("Developer" + (i + 1), new InteliJIDEA()));
        }

        return developers;
    }

    private static List<Employee> buildTestingDepartment() {
        List<Employee> QA = new LinkedList<>();
        int numberOfManualQA = getNumber("Testing Department", "Manual QA");
        int numberOAutomationQA = getNumber("Testing Department", "Automation QA");


        for (int i = 0; i < numberOfManualQA; i++) {
            QA.add(new ManualQA<>("Manual QA" + (i + 1), new XRay()));
        }

        for (int i = 0; i < numberOAutomationQA; i++) {
            QA.add(new AutomationQA("Automation QA" + (i + 1), new InteliJIDEA()));
        }

        return QA;
    }

    private static List<Task> buildDesignTaskScope() {
        List<Task> designTasks = new LinkedList<>();
        int numberOfTasks = getNumber("scope for designers", "tasks");
        for (int i = 0; i < numberOfTasks; i++) {
            designTasks.add(new Design("new design system part " + (i + 1), 10));
        }
        return designTasks;
    }

    private static List<Task> buildDevelopmentTaskScope() {
        List<Task> developmentTasks = new LinkedList<>();
        int numberOfTasks = getNumber("scope for developers", "tasks");
        for (int i = 0; i < numberOfTasks; i++) {
            developmentTasks.add(new Development("for user management part  " + (i + 1), 20));
        }
        return developmentTasks;
    }

    private static List<Task> buildTestingTaskScope() {
        List<Task> testingTasks = new LinkedList<>();
        int numberOfTasks = getNumber("scope for QA", "tasks");
        for (int i = 0; i < numberOfTasks; i++) {
            testingTasks.add(new Testing("for user management module part " + (i + 1), 25));
        }
        return testingTasks;
    }

    private static int getNumber(String affiliation, String position) {
        System.out.println("You need to create a " + affiliation + ". How many " + position + " will be in it?");
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("You entered incorrect data. Try again.");
            number = getNumber(affiliation, position);
        }
        if (number <= 0) {
            System.out.println("You entered incorrect data. Try again.");
            number = getNumber(affiliation, position);
        }
        return number;
    }
}
