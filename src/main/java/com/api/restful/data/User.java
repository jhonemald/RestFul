package com.api.restful.data;

import java.util.Date;

public class User {


    private String id;

    private  String name;

    private String email;

    private  String lastname;

    private  Date created;

    private String grade;

    public User(String id, String name, String email, String lastname)
    {

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.created = new Date();
    }


    public Date getCreated() {
        return created;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) { this.id = id; }

    public void setGrade(String Grade) { this.grade = grade;}


}