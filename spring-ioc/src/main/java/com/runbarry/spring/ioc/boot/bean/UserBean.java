package com.runbarry.spring.ioc.boot.bean;

public class UserBean {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;

    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
