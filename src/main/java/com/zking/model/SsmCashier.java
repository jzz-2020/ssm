package com.zking.model;

import lombok.ToString;

public class SsmCashier {
    private Integer caId;

    private Integer userId;

    private String caName;

    private Float caMoney;

    private Integer salaryFinanceId;

    private Integer classId;

    private String caDate;

    private Integer caStatus;

    private SsmUser ssmUser;

    private SsmRevenueCashier ssmRevenueCashier;

    public SsmCashier(Integer caId, Integer userId, String caName, Float caMoney, Integer salaryFinanceId, Integer classId, String caDate, Integer caStatus) {
        this.caId = caId;
        this.userId = userId;
        this.caName = caName;
        this.caMoney = caMoney;
        this.salaryFinanceId = salaryFinanceId;
        this.classId = classId;
        this.caDate = caDate;
        this.caStatus = caStatus;
    }

    public SsmCashier() {
        super();
    }

    public SsmUser getSsmUser() {
        return ssmUser;
    }

    public void setSsmUser(SsmUser ssmUser) {
        this.ssmUser = ssmUser;
    }

    public SsmRevenueCashier getSsmRevenueCashier() {
        return ssmRevenueCashier;
    }

    public void setSsmRevenueCashier(SsmRevenueCashier ssmRevenueCashier) {
        this.ssmRevenueCashier = ssmRevenueCashier;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }
    public Integer getCaId() {
        return caId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public Float getCaMoney() {
        return caMoney;
    }

    public void setCaMoney(Float caMoney) {
        this.caMoney = caMoney;
    }

    public Integer getSalaryFinanceId() {
        return salaryFinanceId;
    }

    public void setSalaryFinanceId(Integer salaryFinanceId) {
        this.salaryFinanceId = salaryFinanceId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getCaDate() {
        return caDate;
    }

    public void setCaDate(String caDate) {
        this.caDate = caDate;
    }

    public Integer getCaStatus() {
        return caStatus;
    }

    public void setCaStatus(Integer caStatus) {
        this.caStatus = caStatus;
    }

    @Override
    public String toString() {
        return "SsmCashier{" +
                "caId=" + caId +
                ", userId=" + userId +
                ", caName='" + caName + '\'' +
                ", caMoney=" + caMoney +
                ", salaryFinanceId=" + salaryFinanceId +
                ", classId=" + classId +
                ", caDate='" + caDate + '\'' +
                ", caStatus=" + caStatus +
                ", ssmUser=" + ssmUser.toString() +
                ", ssmRevenueCashier=" + ssmRevenueCashier.toString() +
                '}';
    }
}