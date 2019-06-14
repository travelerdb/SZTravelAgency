package com.entity;


public class Combocuetab {

  private long cueId;
  private String cueInfo;


  public long getCueId() {
    return cueId;
  }

  public void setCueId(long cueId) {
    this.cueId = cueId;
  }


  public String getCueInfo() {
    return cueInfo;
  }

  public void setCueInfo(String cueInfo) {
    this.cueInfo = cueInfo;
  }

  @Override
  public String toString() {
    return "Combocuetab{" +
            "cueId=" + cueId +
            ", cueInfo='" + cueInfo + '\'' +
            '}';
  }
}
