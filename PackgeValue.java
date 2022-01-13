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
public class PackgeValue {
    private String PackageSerilNumber;
    private int PackageID;
    private String OwnerPackageName,OwnerPhoneNumber,OwnerFacount,PackgePrice,PackgeNote, PackgeDate,PackgeDamperntHolder,PackgeImagePath;
    private boolean  PackgeDilverd,customs;

    public PackgeValue() {
    }


    

    public PackgeValue(String PackageSerilNumber, int PackageID, String OwnerPackageName, String OwnerPhoneNumber, String OwnerFacount, String PackgePrice, String PackgeNote, String PackgeDate,String PackgeDamperntHolder,String PackgeImagePath, boolean PackgeDilverd, boolean customs) {
        this.PackageSerilNumber = PackageSerilNumber;
        this.PackageID = PackageID;
        this.OwnerPackageName = OwnerPackageName;
        this.OwnerPhoneNumber = OwnerPhoneNumber;
        this.OwnerFacount = OwnerFacount;
        this.PackgePrice = PackgePrice;
        this.PackgeNote = PackgeNote;
        this.PackgeDate = PackgeDate;
        this.PackgeDilverd = PackgeDilverd;
        this.customs = customs;
        this.PackgeDamperntHolder=PackgeDamperntHolder;
        this.PackgeImagePath=PackgeImagePath;
    }
      /*public PackgeValue(String PackageSerilNumber, int PackageID, String OwnerPackageName, String OwnerPhoneNumber, String OwnerFacount, String PackgePrice,  String PackgeDate,String PackgeNote) {
        this.PackageSerilNumber = PackageSerilNumber;
        this.PackageID = PackageID;
        this.OwnerPackageName = OwnerPackageName;
        this.OwnerPhoneNumber = OwnerPhoneNumber;
        this.OwnerFacount = OwnerFacount;
        this.PackgePrice = PackgePrice;
        this.PackgeNote = PackgeNote;
        this.PackgeDate = PackgeDate;
        this.PackgeDilverd = PackgeDilverd;
        this.customs = customs;
    }*/



    public String getPackgeDate() {
        return PackgeDate;
    }

    public void setPackgeDate(String PackgeDate) {
        this.PackgeDate = PackgeDate;
    }

    

    public String getPackageSerilNumber() {
        return PackageSerilNumber;
    }

    public void setPackageSerilNumber(String PackageSerilNumber) {
        this.PackageSerilNumber = PackageSerilNumber;
    }

    public int getPackageID() {
        return PackageID;
    }

    public void setPackageID(int PackageID) {
        this.PackageID = PackageID;
    }

    public String getOwnerPackageName() {
        return OwnerPackageName;
    }

    public void setOwnerPackageName(String OwnerPackageName) {
        this.OwnerPackageName = OwnerPackageName;
    }

    public String getOwnerPhoneNumber() {
        return OwnerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String OwnerPhoneNumber) {
        this.OwnerPhoneNumber = OwnerPhoneNumber;
    }

    public String getOwnerFacount() {
        return OwnerFacount;
    }

    public void setOwnerFacount(String OwnerFacount) {
        this.OwnerFacount = OwnerFacount;
    }

    public String getPackgePrice() {
        return PackgePrice;
    }

    public void setPackgePrice(String PackgePrice) {
        this.PackgePrice = PackgePrice;
    }

    public String getPackgeNote() {
        return PackgeNote;
    }

    public void setPackgeNote(String PackgeNote) {
        this.PackgeNote = PackgeNote;
    }

    public boolean isPackgeDilverd() {
        return PackgeDilverd;
    }

    public void setPackgeDilverd(boolean PackgeDilverd) {
        this.PackgeDilverd = PackgeDilverd;
    }

    public boolean isCustoms() {
        return customs;
    }

    public void setCustoms(boolean customs) {
        this.customs = customs;
    }

    public String getPackgeDamperntHolder() {
        return PackgeDamperntHolder;
    }

    public void setPackgeDamperntHolder(String PackgeDamperntHolder) {
        this.PackgeDamperntHolder = PackgeDamperntHolder;
    }
        public String getPackgeImagePath() {
        return PackgeImagePath;
    }

    public void setPackgeImagePath(String PackgeImagePath) {
        this.PackgeImagePath = PackgeImagePath;
    }
    
    
    
}
