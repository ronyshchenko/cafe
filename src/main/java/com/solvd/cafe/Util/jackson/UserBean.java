package com.solvd.cafe.Util.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBean {
    private int id;
    private String name;
    @JsonProperty("family")
    private String surName;

    public UserBean(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonGetter("firstName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    //@JsonValue
    public String toJsonValue() {
        return toString();
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
