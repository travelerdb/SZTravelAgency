package com.entity;


public class Locustab {

  private long locusId;
  private String locusName;
  private String locusImg;
  private long cityId;


  public long getLocusId() {
    return locusId;
  }

  public void setLocusId(long locusId) {
    this.locusId = locusId;
  }


  public String getLocusName() {
    return locusName;
  }

  public void setLocusName(String locusName) {
    this.locusName = locusName;
  }


  public String getLocusImg() {
    return locusImg;
  }

  public void setLocusImg(String locusImg) {
    this.locusImg = locusImg;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }

  @Override
  public String toString() {
    return "Locustab{" +
            "locusId=" + locusId +
            ", locusName='" + locusName + '\'' +
            ", locusImg='" + locusImg + '\'' +
            ", cityId=" + cityId +
            '}';
  }
}
