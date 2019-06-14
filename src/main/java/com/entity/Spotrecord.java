package com.entity;


public class Spotrecord {

  private long srecId;
  private String srecName;
  private String address;
  private String phone;
  private long num;
  private double price;
  private double totalPay;
  private long comboId;
  private long issComId;


  public long getSrecId() {
    return srecId;
  }

  public void setSrecId(long srecId) {
    this.srecId = srecId;
  }


  public String getSrecName() {
    return srecName;
  }

  public void setSrecName(String srecName) {
    this.srecName = srecName;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
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
    return "Spotrecord{" +
            "srecId=" + srecId +
            ", srecName='" + srecName + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            ", num=" + num +
            ", price=" + price +
            ", totalPay=" + totalPay +
            ", comboId=" + comboId +
            ", issComId=" + issComId +
            '}';
  }
}
