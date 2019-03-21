package com.mechanical.model;

import java.text.DecimalFormat;
import java.util.Date;

public class UserModel{
    private Long id;
    private String name;
    private DecimalFormat money;
    private String is_deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DecimalFormat getMoney() {
        return money;
    }

    public void setMoney(DecimalFormat money) {
        this.money = money;
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    private Date create_date;
    private Date modify_date;

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", is_deleted='" + is_deleted + '\'' +
                ", create_date=" + create_date +
                ", modify_date=" + modify_date +
                '}';
    }

    public UserModel(){}

}
