package com.example.cs10.entity;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
    private int id;
    private String name;
    private LocalDate birthday;
    private String address;
    private String picture;

    public Customer() {
    }

    public Customer(int id, String name, LocalDate birthday, String address, String picture) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
