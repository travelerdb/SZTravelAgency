package com.entity;


public class Tickettypetab {

  private long ticTypeId;
  private String ticType;


  public long getTicTypeId() {
    return ticTypeId;
  }

  public void setTicTypeId(long ticTypeId) {
    this.ticTypeId = ticTypeId;
  }


  public String getTicType() {
    return ticType;
  }

  public void setTicType(String ticType) {
    this.ticType = ticType;
  }

  @Override
  public String toString() {
    return "Tickettypetab{" +
            "ticTypeId=" + ticTypeId +
            ", ticType='" + ticType + '\'' +
            '}';
  }
}
