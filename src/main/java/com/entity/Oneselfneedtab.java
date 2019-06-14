package com.entity;


public class Oneselfneedtab {

  private long needId;
  private long clientId;
  private String beginCity;
  private long countDay;
  private String hopeCity;
  private long expectAdule;
  private long expectChild;
  private double expectPay;
  private String needServe;
  private long needNum;
  private String otherNeedInfo;
  private String phone;
  private long wechatNum;


  public long getNeedId() {
    return needId;
  }

  public void setNeedId(long needId) {
    this.needId = needId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public String getBeginCity() {
    return beginCity;
  }

  public void setBeginCity(String beginCity) {
    this.beginCity = beginCity;
  }


  public long getCountDay() {
    return countDay;
  }

  public void setCountDay(long countDay) {
    this.countDay = countDay;
  }


  public String getHopeCity() {
    return hopeCity;
  }

  public void setHopeCity(String hopeCity) {
    this.hopeCity = hopeCity;
  }


  public long getExpectAdule() {
    return expectAdule;
  }

  public void setExpectAdule(long expectAdule) {
    this.expectAdule = expectAdule;
  }


  public long getExpectChild() {
    return expectChild;
  }

  public void setExpectChild(long expectChild) {
    this.expectChild = expectChild;
  }


  public double getExpectPay() {
    return expectPay;
  }

  public void setExpectPay(double expectPay) {
    this.expectPay = expectPay;
  }


  public String getNeedServe() {
    return needServe;
  }

  public void setNeedServe(String needServe) {
    this.needServe = needServe;
  }


  public long getNeedNum() {
    return needNum;
  }

  public void setNeedNum(long needNum) {
    this.needNum = needNum;
  }


  public String getOtherNeedInfo() {
    return otherNeedInfo;
  }

  public void setOtherNeedInfo(String otherNeedInfo) {
    this.otherNeedInfo = otherNeedInfo;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getWechatNum() {
    return wechatNum;
  }

  public void setWechatNum(long wechatNum) {
    this.wechatNum = wechatNum;
  }

  @Override
  public String toString() {
    return "Oneselfneedtab{" +
            "needId=" + needId +
            ", clientId=" + clientId +
            ", beginCity='" + beginCity + '\'' +
            ", countDay=" + countDay +
            ", hopeCity='" + hopeCity + '\'' +
            ", expectAdule=" + expectAdule +
            ", expectChild=" + expectChild +
            ", expectPay=" + expectPay +
            ", needServe='" + needServe + '\'' +
            ", needNum=" + needNum +
            ", otherNeedInfo='" + otherNeedInfo + '\'' +
            ", phone='" + phone + '\'' +
            ", wechatNum=" + wechatNum +
            '}';
  }
}
