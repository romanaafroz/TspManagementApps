package com.spring.maven.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "expense")
@Table(name = "expense")
public class Expense {

    @Id
    private int exId;
    private int electricityBills;
    private int internetBills;
    private int waterBills;
    private int rent;
    private int tax;
    private int others;
    private int total;

    public int getExId() {
        return exId;
    }

    public void setExId(int exId) {
        this.exId = exId;
    }

    public int getInternetBills() {
        return internetBills;
    }

    public void setInternetBills(int internetBills) {
        this.internetBills = internetBills;
    }

    public int getElectricityBills() {
        return electricityBills;
    }

    public void setElectricityBills(int electricityBills) {
        this.electricityBills = electricityBills;
    }

    public int getWaterBills() {
        return waterBills;
    }

    public void setWaterBills(int waterBills) {
        this.waterBills = waterBills;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
