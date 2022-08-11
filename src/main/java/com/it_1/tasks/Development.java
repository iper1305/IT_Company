package com.it_1.tasks;

public class Development extends Task {
    private String gitLink;
    private int storyPoints;

    public Development(int id, String name, String description, String gitLink, int storyPoints) {
        super(id, name, description);
        this.gitLink = gitLink;
        this.storyPoints = storyPoints;
    }

    public Development(int id, String name, String description) {
        super(id, name, description);
    }

    public String getGitLink() {
        return gitLink;
    }

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }
}
