package com.tribepay.mvcapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private int id;

    private String name;
    private String password;
    private String location;
    private String birth_date;

    public Users() {
    }

    public Users(int id, String name,String password, String location, String birth_date) {
        this.id = id;
        this.name = name;
        this.name = password;
        this.location = location;
        this.birth_date = birth_date;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirth_date() {
        return birth_date;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                ", birth_date='" + birth_date + '\'' +
                '}';
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}
