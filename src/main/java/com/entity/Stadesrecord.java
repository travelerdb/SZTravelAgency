package com.entity;


import java.util.Date;

public class Stadesrecord {

  private long desId;
  private long ticTypeId;
  private String name;
  private String phone;
  private String idCard;
  private long clientId;
  private long orderId;
  private String placeTwo;
  private String timeNum;
  private Date beginDate;


  public long getDesId() {
    return desId;
  }

  public void setDesId(long desId) {
    this.desId = desId;
  }


  public long getTicTypeId() {
    return ticTypeId;
  }

  public void setTicTypeId(long ticTypeId) {
    this.ticTypeId = ticTypeId;
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


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getPlaceTwo() {
    return placeTwo;
  }

  public void setPlaceTwo(String placeTwo) {
    this.placeTwo = placeTwo;
  }


  public String getTimeNum() {
    return timeNum;
  }

  public void setTimeNum(String timeNum) {
    this.timeNum = timeNum;
  }


  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  @Override
  public String toString() {
    return "Stadesrecord{" +
            "desId=" + desId +
            ", ticTypeId=" + ticTypeId +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", idCard='" + idCard + '\'' +
            ", clientId=" + clientId +
            ", orderId=" + orderId +
            ", placeTwo='" + placeTwo + '\'' +
            ", timeNum='" + timeNum + '\'' +
            ", beginDate=" + beginDate +
            '}';
  }
}
