package com.entity.lyq;


public class Comdoltype1 {

  private long dolId;
  private String dolName;
  private String dolImg;
  private long typeId;


  public long getDolId() {
    return dolId;
  }

  public void setDolId(long dolId) {
    this.dolId = dolId;
  }


  public String getDolName() {
    return dolName;
  }

  public void setDolName(String dolName) {
    this.dolName = dolName;
  }


  public String getDolImg() {
    return dolImg;
  }

  public void setDolImg(String dolImg) {
    this.dolImg = dolImg;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }

  @Override
  public String toString() {
    return "Comdoltype{" +
            "dolId=" + dolId +
            ", dolName='" + dolName + '\'' +
            ", dolImg='" + dolImg + '\'' +
            ", typeId=" + typeId +
            '}';
  }
}
