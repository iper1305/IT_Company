package it_1.tasks;

public enum Tasks {
    ANALYSIS("Task for Business Analytic"),
    DESIGN ("Task for Designer"),
    DEVELOPMENT ("Task for Developer"),
    TESTING ("Task for Quality Assurance Engineer");

    private String name;
    private int id;

    Tasks(String name) {
        this.name = name;
        this.id = (int) ((Math.random() * (1000000 - 10)) + 10);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
