package com.timekeep.timekeeping.dto;


import java.io.Serializable;
import java.util.Date;

public class UserLogDto implements Serializable {
    private Long id;

    private Date date;

    private Long userCode;

    public UserLogDto(Long id, Date date, Long userCode) {
        this.id = id;
        this.date = date;
        this.userCode = userCode;
    }

    public UserLogDto() {
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

    public Long getUserCode() {
        return userCode;
    }

    public void setUserCode(Long userCode) {
        this.userCode = userCode;
    }
}
