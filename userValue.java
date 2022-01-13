/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aboud.gradleproject1;

/**
 *
 * @author Aboud Mahmoud
 */
public class userValue {
    private String UserName,UserPassword,UserDap; 
     private int UseriId ; 
    

    public userValue(String UserName, String UserPassword,String UserDap, int UseriId) {
        this.UserName = UserName;
        this.UserPassword = UserPassword;
        this.UserDap=UserDap;
        this.UseriId = UseriId;
    
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public String getUserDap() {
        return UserDap;
    }

    public void setUserDap(String UserDap) {
        this.UserDap = UserDap;
    }
    

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public int getUseriId() {
        return UseriId;
    }

    public void setUseriId(int UseriId) {
        this.UseriId = UseriId;
    }

  
    
     
    
}
