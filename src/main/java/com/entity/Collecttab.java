package com.entity;


import java.util.Date;

public class Collecttab {

  private long collId;
  private long clientId;
  private long comboId;
  private Date operaDate;


  public long getCollId() {
    return collId;
  }

  public void setCollId(long collId) {
    this.collId = collId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public Date getOperaDate() {
    return operaDate;
  }

  public void setOperaDate(Date operaDate) {
    this.operaDate = operaDate;
  }

  @Override
  public String toString() {
    return "Collecttab{" +
            "collId=" + collId +
            ", clientId=" + clientId +
            ", comboId=" + comboId +
            ", operaDate=" + operaDate +
            '}';
  }
}
