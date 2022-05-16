package com.solvd.cafe.models;

public class InvoicesModel {

    private int id;
    private String date;
    private int receiverid;
    private String description;
    private int volume;


    public InvoicesModel() {
    }

    public InvoicesModel(int id, String date, int receiverid, String description, int volume) {
        this.id = id;
        this.date = date;
        this.receiverid = receiverid;
        this.description = description;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(int receiverid) {
        this.receiverid = receiverid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "InvoicesModel{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", receiverid=" + receiverid +
                ", description='" + description + '\'' +
                ", volume=" + volume +
                '}';
    }
}
