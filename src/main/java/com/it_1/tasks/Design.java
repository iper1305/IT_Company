package com.it_1.tasks;

public class Design extends Task {
    private String figmaLink;
    private String designSystem;

    public Design(int id, String name, String description,  String figmaLink, String designSystem) {
        super(id, name, description);
        this.figmaLink = figmaLink;
        this.designSystem = designSystem;
    }

    public Design(int id, String name, String description) {
        super(id, name, description);
    }

    public String getFigmaLink() {
        return figmaLink;
    }

    public String getDesignSystem() {
        return designSystem;
    }

    public void setFigmaLink(String figmaLink) {
        this.figmaLink = figmaLink;
    }

    public void setDesignSystem(String designSystem) {
        this.designSystem = designSystem;
    }
}
