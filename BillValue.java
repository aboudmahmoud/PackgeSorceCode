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
public class BillValue {
    private String BillPrice , CousmterName,DaprmentChcker;
    private int ID ;

    public BillValue() {
    }

    public BillValue(String BillPrice, String CousmterName, String DaprmentChcker, int ID) {
        this.BillPrice = BillPrice;
        this.CousmterName = CousmterName;
        this.DaprmentChcker = DaprmentChcker;
        this.ID = ID;
    }

    public String getBillPrice() {
        return BillPrice;
    }

    public void setBillPrice(String BillPrice) {
        this.BillPrice = BillPrice;
    }

    public String getCousmterName() {
        return CousmterName;
    }

    public void setCousmterName(String CousmterName) {
        this.CousmterName = CousmterName;
    }

    public String getDaprmentChcker() {
        return DaprmentChcker;
    }

    public void setDaprmentChcker(String DaprmentChcker) {
        this.DaprmentChcker = DaprmentChcker;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
