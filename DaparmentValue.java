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
public class DaparmentValue {
    private String DaparmentName; 
    private int DarmentID;

    public DaparmentValue() {
    }

    public DaparmentValue(String DaparmentName, int DarmentID) {
        this.DaparmentName = DaparmentName;
        this.DarmentID = DarmentID;
    }

    public String getDaparmentName() {
        return DaparmentName;
    }

    public void setDaparmentName(String DaparmentName) {
        this.DaparmentName = DaparmentName;
    }

    public int getDarmentID() {
        return DarmentID;
    }

    public void setDarmentID(int DarmentID) {
        this.DarmentID = DarmentID;
    }
    
}
