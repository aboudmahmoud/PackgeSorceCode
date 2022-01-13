
package com.aboud.gradleproject1;

public class payValue {
    private int ProccessID; 
    private String Pay,PayForWhat;

    public payValue(int ProccessID, String Pay, String PayForWhat) {
        this.ProccessID = ProccessID;
        this.Pay = Pay;
        this.PayForWhat = PayForWhat;
    }

    public payValue() {
    }

    public int getProccessID() {
        return ProccessID;
    }

    public void setProccessID(int ProccessID) {
        this.ProccessID = ProccessID;
    }

    public String getPay() {
        return Pay;
    }

    public void setPay(String Pay) {
        this.Pay = Pay;
    }

    public String getPayForWhat() {
        return PayForWhat;
    }

    public void setPayForWhat(String PayForWhat) {
        this.PayForWhat = PayForWhat;
    }
    
}
