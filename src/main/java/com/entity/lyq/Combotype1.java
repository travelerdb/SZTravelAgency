package com.entity.lyq;


public class Combotype1 {

  private long typeId;
  private String comboTypeName;
  private String comboTypeImg;


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getComboTypeName() {
    return comboTypeName;
  }

  public void setComboTypeName(String comboTypeName) {
    this.comboTypeName = comboTypeName;
  }


  public String getComboTypeImg() {
    return comboTypeImg;
  }

  public void setComboTypeImg(String comboTypeImg) {
    this.comboTypeImg = comboTypeImg;
  }

  @Override
  public String toString() {
    return "Combotype{" +
            "typeId=" + typeId +
            ", comboTypeName='" + comboTypeName + '\'' +
            ", comboTypeImg='" + comboTypeImg + '\'' +
            '}';
  }
}
