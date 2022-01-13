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
public class dateValue {
    private String Stardate,EndDate,TypeOfProcc; 
    int id; 

    public dateValue(String Stardate, String EndDate, int id, String TypeOfProcc) {
        this.Stardate = Stardate;
        this.EndDate = EndDate;
        this.id = id;
        this.TypeOfProcc=TypeOfProcc;
        
    }

    public String getTypeOfProcc() {
        return TypeOfProcc;
    }

    public void setTypeOfProcc(String TypeOfProcc) {
        this.TypeOfProcc = TypeOfProcc;
    }
    

    public dateValue(String Stardate) {
        this.Stardate = Stardate;
    }

    public String getStardate() {
        return Stardate;
    }

    public void setStardate(String Stardate) {
        this.Stardate = Stardate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
