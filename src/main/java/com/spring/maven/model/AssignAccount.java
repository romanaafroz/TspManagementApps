package com.spring.maven.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "assignAccount")
@Table(name = "assignAccount")
public class AssignAccount {

    @Id

    private int accountId;

    //Expense table
    private int exId;
    private int electricityBills;
    private int internetBills;
    private int waterBills;
    private int rent;
    private int tax;
    private int others;
    private int total;

    //payment table
    private int payId;
    private String cardType;
    private String expireDate;
    private int cardNo;
    private int cvcNo;
    private String tName;
    private String cName;
    private String code;
    private String round;
    private String batch;
    private String email;
    private int totalTrainee;
    private int payAmount;
    private int totalAmount;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getExId() {
        return exId;
    }

    public void setExId(int exId) {
        this.exId = exId;
    }

    public int getElectricityBills() {
        return electricityBills;
    }

    public void setElectricityBills(int electricityBills) {
        this.electricityBills = electricityBills;
    }

    public int getInternetBills() {
        return internetBills;
    }

    public void setInternetBills(int internetBills) {
        this.internetBills = internetBills;
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

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvcNo() {
        return cvcNo;
    }

    public void setCvcNo(int cvcNo) {
        this.cvcNo = cvcNo;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalTrainee() {
        return totalTrainee;
    }

    public void setTotalTrainee(int totalTrainee) {
        this.totalTrainee = totalTrainee;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

}
