package com.api.restful.dto;

public class UserDto {

    private String name;



    private String email;



    private String lastname;

    public UserDto(String name, String email, String lastname ) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }


}
