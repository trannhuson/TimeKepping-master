package com.timekeep.timekeeping.dto;


import java.io.Serializable;

public class UserDto implements Serializable {
<<<<<<< HEAD

=======
//	private Long id;
	
>>>>>>> add files
    private Long code;

    private String name;

    private String role;

    public UserDto() {
    }

    public UserDto(Long code, String name, String role) {
<<<<<<< HEAD
=======
    	//this.id = id;
>>>>>>> add files
        this.code = code;
        this.name = name;
        this.role = role;
    }
<<<<<<< HEAD

    public Long getCode() {
=======
    
    
//    public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public Long getCode() {
>>>>>>> add files
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


