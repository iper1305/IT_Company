package com.it_1.tasks;

public class Testing extends Task {
    private String testCoverage;
    private String testType;

    public Testing(int id, String name, String description, String testCoverage, String testType) {
        super(id, name, description);
        this.testCoverage = testCoverage;
        this.testType = testType;
    }

    public Testing(int id, String name, String description) {
        super(id, name, description);
    }

    public String getTestCoverage() {
        return testCoverage;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestCoverage(String testCoverage) {
        this.testCoverage = testCoverage;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
