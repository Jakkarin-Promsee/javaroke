package models;

import utils.Validator;

public class NodeLyric {
    private String time;
    private String line;

    public NodeLyric(String time, String line) {
        Validator.validateTimeForm(time);
        this.time = time;
        this.line = line;
    }

    public String getTime() {

        return time;
    }

    public String getline() {
        return line;
    }

    public void setTime(String time) {
        Validator.validateTimeForm(time);
        this.time = time;
    }

    public void setLine(String line) {
        this.line = line;
    }
}
