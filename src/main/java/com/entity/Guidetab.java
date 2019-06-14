package com.entity;


import java.util.Date;

public class Guidetab {

  private long guidId;
  private long operaId;
  private long comboId;
  private long issComId;
  private Date beginDate;
  private long issComState;


  public long getGuidId() {
    return guidId;
  }

  public void setGuidId(long guidId) {
    this.guidId = guidId;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public long getIssComId() {
    return issComId;
  }

  public void setIssComId(long issComId) {
    this.issComId = issComId;
  }


  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }


  public long getIssComState() {
    return issComState;
  }

  public void setIssComState(long issComState) {
    this.issComState = issComState;
  }

  @Override
  public String toString() {
    return "Guidetab{" +
            "guidId=" + guidId +
            ", operaId=" + operaId +
            ", comboId=" + comboId +
            ", issComId=" + issComId +
            ", beginDate=" + beginDate +
            ", issComState=" + issComState +
            '}';
  }
}
