package com.timekeep.timekeeping.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_log")
public class UserLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date date;

    @ManyToOne
<<<<<<< HEAD
=======
    @JoinColumn(name = "user_id")
>>>>>>> add files
    private User user;

    public UserLog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
