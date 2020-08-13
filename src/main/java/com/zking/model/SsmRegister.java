package com.zking.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class SsmRegister {
    private Integer rId;

    private String rName;

    private String rSex;

    private Integer rAge;

    private String rPhone;

    private Integer rStatus;

    private Date rDate;

    public SsmRegister(Integer rId, String rName, String rSex, Integer rAge, String rPhone, Integer rStatus, Date rDate) {
        this.rId = rId;
        this.rName = rName;
        this.rSex = rSex;
        this.rAge = rAge;
        this.rPhone = rPhone;
        this.rStatus = rStatus;
        this.rDate = rDate;
    }

    public SsmRegister() {
        super();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrSex() {
        return rSex;
    }

    public void setrSex(String rSex) {
        this.rSex = rSex;
    }

    public Integer getrAge() {
        return rAge;
    }

    public void setrAge(Integer rAge) {
        this.rAge = rAge;
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public Integer getrStatus() {
        return rStatus;
    }

    public void setrStatus(Integer rStatus) {
        this.rStatus = rStatus;
    }

    public Date getrDate() {
        return rDate;
    }

    public void setrDate(Date rDate) {
        this.rDate = rDate;
    }
}