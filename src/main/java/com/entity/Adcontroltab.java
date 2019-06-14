package com.entity;


public class Adcontroltab {

  private long adId;
  private String adImage;
  private String hrefStr;


  public long getAdId() {
    return adId;
  }

  public void setAdId(long adId) {
    this.adId = adId;
  }


  public String getAdImage() {
    return adImage;
  }

  public void setAdImage(String adImage) {
    this.adImage = adImage;
  }


  public String getHrefStr() {
    return hrefStr;
  }

  public void setHrefStr(String hrefStr) {
    this.hrefStr = hrefStr;
  }

  @Override
  public String toString() {
    return "Adcontroltab{" +
            "adId=" + adId +
            ", adImage='" + adImage + '\'' +
            ", hrefStr='" + hrefStr + '\'' +
            '}';
  }
}
