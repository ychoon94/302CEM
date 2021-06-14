package com.example.smileyrestaurant.model;

public class Staff {
    private String username;
    private String password;
    private String roles;

    public Staff(String username, String password, String roles){
        this.username = username;
        this.password = password;
        this.roles = roles;
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
