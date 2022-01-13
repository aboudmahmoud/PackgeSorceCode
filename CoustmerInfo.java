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
public class CoustmerInfo {
    private String CoustmerName,DamerntOfCastmr,CosutmerFees,CoustmerPays;
    private int CoustmerID,NumberOfBackge;

    public CoustmerInfo(String CoustmerName, String DamerntOfCastmr, String CosutmerFees, String CoustmerPays, int CoustmerID,int NumberOfBackge) {
        this.CoustmerName = CoustmerName;
        this.DamerntOfCastmr = DamerntOfCastmr;
        this.CosutmerFees = CosutmerFees;
        this.CoustmerPays = CoustmerPays;
        this.CoustmerID = CoustmerID;
        this.NumberOfBackge=NumberOfBackge;
    }

    public CoustmerInfo() {
    }

    public String getCoustmerName() {
        return CoustmerName;
    }

    public void setCoustmerName(String CoustmerName) {
        this.CoustmerName = CoustmerName;
    }

    public String getDamerntOfCastmr() {
        return DamerntOfCastmr;
    }

    public void setDamerntOfCastmr(String DamerntOfCastmr) {
        this.DamerntOfCastmr = DamerntOfCastmr;
    }

    public String getCosutmerFees() {
        return CosutmerFees;
    }

    public void setCosutmerFees(String CosutmerFees) {
        this.CosutmerFees = CosutmerFees;
    }

    public String getCoustmerPays() {
        return CoustmerPays;
    }

    public void setCoustmerPays(String CoustmerPays) {
        this.CoustmerPays = CoustmerPays;
    }

    public int getCoustmerID() {
        return CoustmerID;
    }

    public void setCoustmerID(int CoustmerID) {
        this.CoustmerID = CoustmerID;
    }

    public int getNumberOfBackge() {
        return NumberOfBackge;
    }

    public void setNumberOfBackge(int NumberOfBackge) {
        this.NumberOfBackge = NumberOfBackge;
    }
    
    
}
