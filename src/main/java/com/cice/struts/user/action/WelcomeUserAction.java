package com.cice.struts.user.action;

import com.cice.struts2.user.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cice
 */
public class WelcomeUserAction {

    private String username;
    private String password;

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

    // all struts logic here
    public String execute() {
        
        System.out.println(username);
        System.out.println(password);
        return "SUCCESS";

    }

}
