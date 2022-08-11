package com.it_1.tasks;

public class Analysis extends Task {
    private String googleTagManagerLink;
    private String confluenceLink;

    public Analysis(int id, String name, String description, String googleTagManagerLink, String confluenceLink) {
        super(id, name, description);
        this.googleTagManagerLink = googleTagManagerLink;
        this.confluenceLink = confluenceLink;
    }

    public Analysis(int id, String name, String description) {
        super(id, name, description);
    }

    public String getGoogleTagManagerLink() {
        return googleTagManagerLink;
    }

    public String getConfluenceLink() {
        return confluenceLink;
    }

    public void setGoogleTagManagerLink(String googleTagManagerLink) {
        this.googleTagManagerLink = googleTagManagerLink;
    }

    public void setConfluenceLink(String confluenceLink) {
        this.confluenceLink = confluenceLink;
    }
}
