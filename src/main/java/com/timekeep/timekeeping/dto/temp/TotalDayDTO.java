package com.timekeep.timekeeping.dto.temp;

import com.timekeep.timekeeping.entity.User;

import java.util.Date;

public class TotalDayDTO {
    private Long id;
    private Long userId;
    private int month;
    private Long total;
    public TotalDayDTO() {
    }

    public TotalDayDTO( Long id,Long userId, int month, Long total) {
        this.id = id;
        this.userId = userId;
        this.month = month;
        this.total = total;
    }

    //    public TotalDayDTO(Date date, Long total, User user) {
//        this.month = date.getMonth();
//        this.total = total;
//        this.userId = user.getCode();
//    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
