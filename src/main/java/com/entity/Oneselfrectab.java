package com.entity;


import java.util.Date;

public class Oneselfrectab {

  private long recortdId;
  private long clientId;
  private long needId;
  private long comboId;
  private long orderId;
  private long issComId;
  private long recortdState;
  private long operaId;
  private Date operaDate;


  public long getRecortdId() {
    return recortdId;
  }

  public void setRecortdId(long recortdId) {
    this.recortdId = recortdId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public long getNeedId() {
    return needId;
  }

  public void setNeedId(long needId) {
    this.needId = needId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getIssComId() {
    return issComId;
  }

  public void setIssComId(long issComId) {
    this.issComId = issComId;
  }


  public long getRecortdState() {
    return recortdState;
  }

  public void setRecortdState(long recortdState) {
    this.recortdState = recortdState;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }


  public Date getOperaDate() {
    return operaDate;
  }

  public void setOperaDate(Date operaDate) {
    this.operaDate = operaDate;
  }

  @Override
  public String toString() {
    return "Oneselfrectab{" +
            "recortdId=" + recortdId +
            ", clientId=" + clientId +
            ", needId=" + needId +
            ", comboId=" + comboId +
            ", orderId=" + orderId +
            ", issComId=" + issComId +
            ", recortdState=" + recortdState +
            ", operaId=" + operaId +
            ", operaDate=" + operaDate +
            '}';
  }
}
