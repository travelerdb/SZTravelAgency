package com.entity;


public class Spottab {

  private long spotId;
  private String spotName;
  private String address;
  private String describe;
  private String spotImage;
  private long level;
  private long locusId;
  private String phone;


  public long getSpotId() {
    return spotId;
  }

  public void setSpotId(long spotId) {
    this.spotId = spotId;
  }


  public String getSpotName() {
    return spotName;
  }

  public void setSpotName(String spotName) {
    this.spotName = spotName;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }


  public String getSpotImage() {
    return spotImage;
  }

  public void setSpotImage(String spotImage) {
    this.spotImage = spotImage;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public long getLocusId() {
    return locusId;
  }

  public void setLocusId(long locusId) {
    this.locusId = locusId;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Spottab{" +
            "spotId=" + spotId +
            ", spotName='" + spotName + '\'' +
            ", address='" + address + '\'' +
            ", describe='" + describe + '\'' +
            ", spotImage='" + spotImage + '\'' +
            ", level=" + level +
            ", locusId=" + locusId +
            ", phone='" + phone + '\'' +
            '}';
  }
}
