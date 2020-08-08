package com.zking.model;

import java.util.Date;

public class SsmCource {
    private Integer courceId;

    private String courceName;

    private Date courceDate;

    private Integer courceCount;

    private Float courceCredit;

    private String courceBak;

    public SsmCource(Integer courceId, String courceName, Date courceDate, Integer courceCount, Float courceCredit, String courceBak) {
        this.courceId = courceId;
        this.courceName = courceName;
        this.courceDate = courceDate;
        this.courceCount = courceCount;
        this.courceCredit = courceCredit;
        this.courceBak = courceBak;
    }

    public SsmCource() {
        super();
    }

    public Integer getCourceId() {
        return courceId;
    }

    public void setCourceId(Integer courceId) {
        this.courceId = courceId;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public Date getCourceDate() {
        return courceDate;
    }

    public void setCourceDate(Date courceDate) {
        this.courceDate = courceDate;
    }

    public Integer getCourceCount() {
        return courceCount;
    }

    public void setCourceCount(Integer courceCount) {
        this.courceCount = courceCount;
    }

    public Float getCourceCredit() {
        return courceCredit;
    }

    public void setCourceCredit(Float courceCredit) {
        this.courceCredit = courceCredit;
    }

    public String getCourceBak() {
        return courceBak;
    }

    public void setCourceBak(String courceBak) {
        this.courceBak = courceBak;
    }
}