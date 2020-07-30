package com.timekeep.timekeeping.entity;

import javax.persistence.*;
@Entity
@Table(name = "total_day")
public class TotalDay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="user_id")
    private Long UserId;

    @Column
    private int month;

    @Column
    private Long total;

    public TotalDay() {
    }

    public TotalDay(Long id,Long userId, int month, Long total) {
        this.id = id;
        this.UserId = userId;
        this.month = month;
        this.total = total;
    }

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
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
