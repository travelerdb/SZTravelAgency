package com.entity;


public class Evaluatetab {

  private long evaId;
  private long orderId;
  private long comboId;
  private long evaLevel;
  private String evaInfo;


  public long getEvaId() {
    return evaId;
  }

  public void setEvaId(long evaId) {
    this.evaId = evaId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public long getEvaLevel() {
    return evaLevel;
  }

  public void setEvaLevel(long evaLevel) {
    this.evaLevel = evaLevel;
  }


  public String getEvaInfo() {
    return evaInfo;
  }

  public void setEvaInfo(String evaInfo) {
    this.evaInfo = evaInfo;
  }

  @Override
  public String toString() {
    return "Evaluatetab{" +
            "evaId=" + evaId +
            ", orderId=" + orderId +
            ", comboId=" + comboId +
            ", evaLevel=" + evaLevel +
            ", evaInfo='" + evaInfo + '\'' +
            '}';
  }
}
