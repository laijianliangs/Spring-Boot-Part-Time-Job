package com.atljl.parttime.model;

public class User {
    private String username;
    private String sex;
    private long ID;
    private int age;
    private long usernumber;
    private String userexperience;
    private String userpassword;
    private String realname;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", usernumber=" + usernumber +
                ", userexperience='" + userexperience + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(long usernumber) {
        this.usernumber = usernumber;
    }

    public String getUserexperience() {
        return userexperience;
    }

    public void setUserexperience(String userexperience) {
        this.userexperience = userexperience;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
