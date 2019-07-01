package com.entity.lyq;


import java.util.Date;

public class Ordertab1 {

  private long orderId;
  private Date orderDate;
  private Date payDate;
  private long clientId;
  private long comboId;
  private long issComId;
  private long joinAdult;
  private long joinChildren;
  private long joinCount;
  private double payMoney;
  private long orderState;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }


  public Date getPayDate() {
    return payDate;
  }

  public void setPayDate(Date payDate) {
    this.payDate = payDate;
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


  public long getIssComId() {
    return issComId;
  }

  public void setIssComId(long issComId) {
    this.issComId = issComId;
  }


  public long getJoinAdult() {
    return joinAdult;
  }

  public void setJoinAdult(long joinAdult) {
    this.joinAdult = joinAdult;
  }


  public long getJoinChildren() {
    return joinChildren;
  }

  public void setJoinChildren(long joinChildren) {
    this.joinChildren = joinChildren;
  }


  public long getJoinCount() {
    return joinCount;
  }

  public void setJoinCount(long joinCount) {
    this.joinCount = joinCount;
  }


  public double getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(double payMoney) {
    this.payMoney = payMoney;
  }


  public long getOrderState() {
    return orderState;
  }

  public void setOrderState(long orderState) {
    this.orderState = orderState;
  }

  @Override
  public String toString() {
    return "Ordertab{" +
            "orderId=" + orderId +
            ", orderDate=" + orderDate +
            ", payDate=" + payDate +
            ", clientId=" + clientId +
            ", comboId=" + comboId +
            ", issComId=" + issComId +
            ", joinAdult=" + joinAdult +
            ", joinChildren=" + joinChildren +
            ", joinCount=" + joinCount +
            ", payMoney=" + payMoney +
            ", orderState=" + orderState +
            '}';
  }
}
