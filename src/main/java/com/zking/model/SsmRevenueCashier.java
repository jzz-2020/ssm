package com.zking.model;

import lombok.ToString;

@ToString
public class SsmRevenueCashier {
    private Integer classId;

    private String className;

    private Integer claId;

    public SsmRevenueCashier(Integer classId, String className, Integer claId) {
        this.classId = classId;
        this.className = className;
        this.claId = claId;
    }

    public SsmRevenueCashier() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }
}