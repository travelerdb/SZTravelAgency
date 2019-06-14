package com.entity;


public class Exestab {

  private long exesId;
  private long exesType;
  private String exesInfo;


  public long getExesId() {
    return exesId;
  }

  public void setExesId(long exesId) {
    this.exesId = exesId;
  }


  public long getExesType() {
    return exesType;
  }

  public void setExesType(long exesType) {
    this.exesType = exesType;
  }


  public String getExesInfo() {
    return exesInfo;
  }

  public void setExesInfo(String exesInfo) {
    this.exesInfo = exesInfo;
  }

  @Override
  public String toString() {
    return "Exestab{" +
            "exesId=" + exesId +
            ", exesType=" + exesType +
            ", exesInfo='" + exesInfo + '\'' +
            '}';
  }
}
