package com.solvd.cafe.models;

public class PositionsModel {

    private int id;
    private String namepositions;
    private String namedepart;
    private int salary;
    private int cafeid;

    public PositionsModel() {
    }

    public PositionsModel(int id, String namepositions, String namedepart, int salary, int cafeid) {
        this.id = id;
        this.namepositions = namepositions;
        this.namedepart = namedepart;
        this.salary = salary;
        this.cafeid = cafeid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamepositions() {
        return namepositions;
    }

    public void setNamepositions(String namepositions) {
        this.namepositions = namepositions;
    }

    public String getNamedepart() {
        return namedepart;
    }

    public void setNamedepart(String namedepart) {
        this.namedepart = namedepart;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCafeid() {
        return cafeid;
    }

    public void setCafeid(int cafeid) {
        this.cafeid = cafeid;
    }

    @Override
    public String toString() {
        return "PositionsModel{" +
                "id=" + id +
                ", namepositions='" + namepositions + '\'' +
                ", namedepart='" + namedepart + '\'' +
                ", salary=" + salary +
                ", cafeid=" + cafeid +
                '}';
    }
}
