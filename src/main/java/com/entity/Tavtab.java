package com.entity;


public class Tavtab {

  private long tavId;
  private String tavName;
  private String tavImg;
  private double consume;
  private long level;
  private String address;
  private String tavPhone;
  private String tavInfo;
  private long locusId;


  public long getTavId() {
    return tavId;
  }

  public void setTavId(long tavId) {
    this.tavId = tavId;
  }


  public String getTavName() {
    return tavName;
  }

  public void setTavName(String tavName) {
    this.tavName = tavName;
  }


  public String getTavImg() {
    return tavImg;
  }

  public void setTavImg(String tavImg) {
    this.tavImg = tavImg;
  }


  public double getConsume() {
    return consume;
  }

  public void setConsume(double consume) {
    this.consume = consume;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getTavPhone() {
    return tavPhone;
  }

  public void setTavPhone(String tavPhone) {
    this.tavPhone = tavPhone;
  }


  public String getTavInfo() {
    return tavInfo;
  }

  public void setTavInfo(String tavInfo) {
    this.tavInfo = tavInfo;
  }


  public long getLocusId() {
    return locusId;
  }

  public void setLocusId(long locusId) {
    this.locusId = locusId;
  }

  @Override
  public String toString() {
    return "Tavtab{" +
            "tavId=" + tavId +
            ", tavName='" + tavName + '\'' +
            ", tavImg='" + tavImg + '\'' +
            ", consume=" + consume +
            ", level=" + level +
            ", address='" + address + '\'' +
            ", tavPhone='" + tavPhone + '\'' +
            ", tavInfo='" + tavInfo + '\'' +
            ", locusId=" + locusId +
            '}';
  }
}
