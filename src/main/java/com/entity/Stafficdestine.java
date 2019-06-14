package com.entity;


public class Stafficdestine {

  private long staffId;
  private long ticTypeId;
  private long staffNum;
  private double price;
  private double totalPay;
  private long comboId;
  private long issComId;


  public long getStaffId() {
    return staffId;
  }

  public void setStaffId(long staffId) {
    this.staffId = staffId;
  }


  public long getTicTypeId() {
    return ticTypeId;
  }

  public void setTicTypeId(long ticTypeId) {
    this.ticTypeId = ticTypeId;
  }


  public long getStaffNum() {
    return staffNum;
  }

  public void setStaffNum(long staffNum) {
    this.staffNum = staffNum;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getTotalPay() {
    return totalPay;
  }

  public void setTotalPay(double totalPay) {
    this.totalPay = totalPay;
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

  @Override
  public String toString() {
    return "Stafficdestine{" +
            "staffId=" + staffId +
            ", ticTypeId=" + ticTypeId +
            ", staffNum=" + staffNum +
            ", price=" + price +
            ", totalPay=" + totalPay +
            ", comboId=" + comboId +
            ", issComId=" + issComId +
            '}';
  }
}
