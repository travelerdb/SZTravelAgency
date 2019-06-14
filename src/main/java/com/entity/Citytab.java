package com.entity;


public class Citytab {

  private long cityId;
  private String cityName;
  private String cityImg;
  private long areaId;


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public String getCityImg() {
    return cityImg;
  }

  public void setCityImg(String cityImg) {
    this.cityImg = cityImg;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }

  @Override
  public String toString() {
    return "Citytab{" +
            "cityId=" + cityId +
            ", cityName='" + cityName + '\'' +
            ", cityImg='" + cityImg + '\'' +
            ", areaId=" + areaId +
            '}';
  }
}
