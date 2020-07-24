package com.timekeep.timekeeping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Admin {
    @Id
    private int id;
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
>>>>>>> add files

    @Column
    private String username;

    @Column
    private String password;

    @ManyToOne
<<<<<<< HEAD
=======
    @JoinColumn(name = "role_id")
>>>>>>> add files
    private Role role;


    public Admin() {
    }

<<<<<<< HEAD
    public int getId() {
        return id;
    }

    public void setId(int id) {
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
>>>>>>> add files
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
