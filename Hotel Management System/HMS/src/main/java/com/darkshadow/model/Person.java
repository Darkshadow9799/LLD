package com.darkshadow.model;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    Account accountDetail;
    String phone;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(Account accountDetail) {
        this.accountDetail = accountDetail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(String name, Account accountDetail, String phone, String email) {
        this.name = name;
        this.accountDetail = accountDetail;
        this.phone = phone;
        this.email = email;
    }
}
