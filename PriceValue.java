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
public class PriceValue {
    private Double TotalCostPay,TotalCostWin, CostPay,CostWin; 

    public PriceValue(Double TotalCostPay, Double TotalCostWin, Double CostPay, Double CostWin) {
        this.TotalCostPay = TotalCostPay;
        this.TotalCostWin = TotalCostWin;
        this.CostPay = CostPay;
        this.CostWin = CostWin;
       
    }

    public PriceValue() {
    }

    public Double getTotalCostPay() {
        return TotalCostPay;
    }

    public void setTotalCostPay(Double TotalCostPay) {
        this.TotalCostPay = TotalCostPay;
    }

    public Double getTotalCostWin() {
        return TotalCostWin;
    }

    public void setTotalCostWin(Double TotalCostWin) {
        this.TotalCostWin = TotalCostWin;
    }

    public Double getCostPay() {
        return CostPay;
    }

    public void setCostPay(Double CostPay) {
        this.CostPay = CostPay;
    }

    public Double getCostWin() {
        return CostWin;
    }

    public void setCostWin(Double CostWin) {
        this.CostWin = CostWin;
    }
      
    
}
