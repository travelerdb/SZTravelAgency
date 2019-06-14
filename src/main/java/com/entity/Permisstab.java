package com.entity;


import java.util.Date;

public class Permisstab {

  private long perId;
  private String perTitle;
  private String icon;
  private String url;
  private long perLevel;
  private Date operaDate;
  private long operaId;


  public long getPerId() {
    return perId;
  }

  public void setPerId(long perId) {
    this.perId = perId;
  }


  public String getPerTitle() {
    return perTitle;
  }

  public void setPerTitle(String perTitle) {
    this.perTitle = perTitle;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getPerLevel() {
    return perLevel;
  }

  public void setPerLevel(long perLevel) {
    this.perLevel = perLevel;
  }


  public Date getOperaDate() {
    return operaDate;
  }

  public void setOperaDate(Date operaDate) {
    this.operaDate = operaDate;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }

  @Override
  public String toString() {
    return "Permisstab{" +
            "perId=" + perId +
            ", perTitle='" + perTitle + '\'' +
            ", icon='" + icon + '\'' +
            ", url='" + url + '\'' +
            ", perLevel=" + perLevel +
            ", operaDate=" + operaDate +
            ", operaId=" + operaId +
            '}';
  }
}
