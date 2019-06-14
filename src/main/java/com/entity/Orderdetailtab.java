package com.entity;


public class Orderdetailtab {

  private long detailId;
  private long orderId;
  private long clientId;
  private String name;
  private String phone;
  private String idCard;
  private long age;
  private String sex;


  public long getDetailId() {
    return detailId;
  }

  public void setDetailId(long detailId) {
    this.detailId = detailId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "Orderdetailtab{" +
            "detailId=" + detailId +
            ", orderId=" + orderId +
            ", clientId=" + clientId +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", idCard='" + idCard + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            '}';
  }
}
