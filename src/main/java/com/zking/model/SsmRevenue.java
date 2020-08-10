package com.zking.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class SsmRevenue {
    private Integer reId;

    private String reYuan;

    private Float reMoney;

    private Integer salaryFinanceId;

    private Float reRatepaying;

    private String reDate;

    private Integer reStatus;

    private Integer classId;

    private String reRemark;



    private SsmRevenueCashier ssmRevenueCashier;

    public SsmRevenue(Integer reId, String reYuan, Float reMoney, Integer salaryFinanceId, Float reRatepaying, String reDate, Integer reStatus, Integer classId, String reRemark) {
        this.reId = reId;
        this.reYuan = reYuan;
        this.reMoney = reMoney;
        this.salaryFinanceId = salaryFinanceId;
        this.reRatepaying = reRatepaying;
        this.reDate = reDate;
        this.reStatus = reStatus;
        this.classId = classId;
        this.reRemark = reRemark;
    }

    public SsmRevenueCashier getSsmRevenueCashier() {
        return ssmRevenueCashier;
    }

    public void setSsmRevenueCashier(SsmRevenueCashier ssmRevenueCashier) {
        this.ssmRevenueCashier = ssmRevenueCashier;
    }

    public SsmRevenue() {
        super();
    }

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getReYuan() {
        return reYuan;
    }

    public void setReYuan(String reYuan) {
        this.reYuan = reYuan;
    }

    public Float getReMoney() {
        return reMoney;
    }

    public void setReMoney(Float reMoney) {
        this.reMoney = reMoney;
    }

    public Integer getSalaryFinanceId() {
        return salaryFinanceId;
    }

    public void setSalaryFinanceId(Integer salaryFinanceId) {
        this.salaryFinanceId = salaryFinanceId;
    }

    public Float getReRatepaying() {
        return reRatepaying;
    }

    public void setReRatepaying(Float reRatepaying) {
        this.reRatepaying = reRatepaying;
    }

    public String getReDate() {
        return reDate;
    }

    public void setReDate(String reDate) {
        this.reDate = reDate;
    }

    public Integer getReStatus() {
        return reStatus;
    }

    public void setReStatus(Integer reStatus) {
        this.reStatus = reStatus;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getReRemark() {
        return reRemark;
    }

    public void setReRemark(String reRemark) {
        this.reRemark = reRemark;
    }
}