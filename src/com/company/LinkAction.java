package com.company;

public class LinkAction {
    private String link;
    private String action;

    public LinkAction(String link, String action) {
        this.link = link;
        this.action = action;
    }

    public String toString() {
        return String.format("Link: %s, action: %s", link, action);
    }

    public String getLink() {
        return link;
    }

    public String getAction() {
        return action;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
