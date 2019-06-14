package com.entity;


public class Tavernrecord {

  private long tavId;
  private String name;
  private String address;
  private String phone;
  private String homeType;
  private long num;
  private double price;
  private double totalPay;
  private long comboId;
  private long issComId;


  public long getTavId() {
    return tavId;
  }

  public void setTavId(long tavId) {
    this.tavId = tavId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public String getHomeType() {
    return homeType;
  }

  public void setHomeType(String homeType) {
    this.homeType = homeType;
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
    return "Tavernrecord{" +
            "tavId=" + tavId +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            ", homeType='" + homeType + '\'' +
            ", num=" + num +
            ", price=" + price +
            ", totalPay=" + totalPay +
            ", comboId=" + comboId +
            ", issComId=" + issComId +
            '}';
  }
}
