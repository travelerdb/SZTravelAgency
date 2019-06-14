package com.entity;


import java.util.Date;

public class Routefeaturetab {

  private long feaId;
  private long comboId;
  private String feaInfo;
  private Date operaDate;
  private long operaId;


  public long getFeaId() {
    return feaId;
  }

  public void setFeaId(long feaId) {
    this.feaId = feaId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public String getFeaInfo() {
    return feaInfo;
  }

  public void setFeaInfo(String feaInfo) {
    this.feaInfo = feaInfo;
  }


  public Date getOperaDate() {
    return operaDate;
  }

  public void setOperaDate(Date operaDate) {
    this.operaDate = operaDate;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }

  @Override
  public String toString() {
    return "Routefeaturetab{" +
            "feaId=" + feaId +
            ", comboId=" + comboId +
            ", feaInfo='" + feaInfo + '\'' +
            ", operaDate=" + operaDate +
            ", operaId=" + operaId +
            '}';
  }
}
