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
public class RequstedValue {
    private String Requstsorder,RequstDiscrabtion,RequstDate;

    public RequstedValue() {
    }

    public RequstedValue(String Requstsorder, String RequstDiscrabtion, String RequstDate) {
        this.Requstsorder = Requstsorder;
        this.RequstDiscrabtion = RequstDiscrabtion;
        this.RequstDate = RequstDate;
    }

    public String getRequstsorder() {
        return Requstsorder;
    }

    public void setRequstsorder(String Requstsorder) {
        this.Requstsorder = Requstsorder;
    }

    public String getRequstDiscrabtion() {
        return RequstDiscrabtion;
    }

    public void setRequstDiscrabtion(String RequstDiscrabtion) {
        this.RequstDiscrabtion = RequstDiscrabtion;
    }

    public String getRequstDate() {
        return RequstDate;
    }

    public void setRequstDate(String RequstDate) {
        this.RequstDate = RequstDate;
    }
    
}
