package com.example.smileyrestaurant;

public class Staff {
    private String username;
    private String password;

    public Staff(String username,String password){
        this.username = username;
        this.password = password;
    }

    public Staff(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

