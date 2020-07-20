package com.example.noteplus.model;

public class ItemNoteModel {

    private String heading;
    private String context;
    private String date;

    public ItemNoteModel(String heading, String context, String date) {
        this.heading = heading;
        this.context = context;
        this.date = date;
    }

    public String getHeading() {
        return heading;
    }

    public String getContext() {
        return context;
    }

    public String getDate() {
        return date;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
