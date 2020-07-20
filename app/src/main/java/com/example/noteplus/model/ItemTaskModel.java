package com.example.noteplus.model;

public class ItemTaskModel {
    private String heading;
    private String deadline;
    private boolean tick;

    public ItemTaskModel(String heading, String deadline, boolean tick) {
        this.heading = heading;
        this.deadline = deadline;
        this.tick = tick;
    }

    public String getHeading() {
        return heading;
    }

    public String getDeadline() {
        return deadline;
    }

    public boolean isTick() {
        return tick;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDeadline(String date) {
        this.deadline = date;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }
}
