package com.stocksonline.login.models;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private int customer_id;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String credit_card_no;
    private String credit_card_validity;
    private String phone;
    private String cvv;
    private String ssn;
    private String balance;

    @Override
    public String toString() {
        return "User{" +
                "customer_id=" + customer_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", credit_card_no='" + credit_card_no + '\'' +
                ", credit_card_validity='" + credit_card_validity + '\'' +
                ", phone='" + phone + '\'' +
                ", cvv='" + cvv + '\'' +
                ", ssn='" + ssn + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCredit_card_no() {
        return credit_card_no;
    }

    public void setCredit_card_no(String credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public String getCredit_card_validity() {
        return credit_card_validity;
    }

    public void setCredit_card_validity(String credit_card_validity) {
        this.credit_card_validity = credit_card_validity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
