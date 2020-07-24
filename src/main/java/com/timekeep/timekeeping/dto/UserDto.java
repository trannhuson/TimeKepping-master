package com.timekeep.timekeeping.dto;


import java.io.Serializable;

public class UserDto implements Serializable {
    private Long code;

    private String name;

    private String role;

    public UserDto() {
    }

    public UserDto(Long code, String name, String role) {
        this.code = code;
        this.name = name;
        this.role = role;
    }

	public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


