package com.example.administrator.bank;

/**
 * Created by Administrator on 2017/7/31.
 */

public class Bank {
    String IdCard;

    @Override
    public String toString() {
        return "Bank{" +
                "IdCard='" + IdCard + '\'' +
                '}';
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }
}
