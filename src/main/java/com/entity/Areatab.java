package com.entity;


public class Areatab {

  private long areaId;
  private String areaName;
  private long outArea;
  private String areaImg;


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }


  public long getOutArea() {
    return outArea;
  }

  public void setOutArea(long outArea) {
    this.outArea = outArea;
  }


  public String getAreaImg() {
    return areaImg;
  }

  public void setAreaImg(String areaImg) {
    this.areaImg = areaImg;
  }

  @Override
  public String toString() {
    return "Areatab{" +
            "areaId=" + areaId +
            ", areaName='" + areaName + '\'' +
            ", outArea=" + outArea +
            ", areaImg='" + areaImg + '\'' +
            '}';
  }
}
