package com.entity.lyq;


import java.io.Serializable;
import java.util.Date;

public class Combotab1  implements Serializable {

  private long comboId;
  private String title;
  private String route;
  private long dolId;
  private long enlistAfterDay;
  private double adultPrice;
  private double childPrice;
  private double allowance;
  private String beginCity;
  private long countDay;
  private String vehicle;
  private String includeInfo;
  private String uncludeInfo;
  private String paymentInfo;
  private String payAttenInfo;
  private String visaInfo;
  private Date operaDate;
  private long operaId;
  private long comboState;
  private String comboImage;
  private String empName;
  private String dolName;

  @Override
  public String toString() {
    return "Combotab1{" +
            "comboId=" + comboId +
            ", title='" + title + '\'' +
            ", route='" + route + '\'' +
            ", dolId=" + dolId +
            ", enlistAfterDay=" + enlistAfterDay +
            ", adultPrice=" + adultPrice +
            ", childPrice=" + childPrice +
            ", allowance=" + allowance +
            ", beginCity='" + beginCity + '\'' +
            ", countDay=" + countDay +
            ", vehicle='" + vehicle + '\'' +
            ", includeInfo='" + includeInfo + '\'' +
            ", uncludeInfo='" + uncludeInfo + '\'' +
            ", paymentInfo='" + paymentInfo + '\'' +
            ", payAttenInfo='" + payAttenInfo + '\'' +
            ", visaInfo='" + visaInfo + '\'' +
            ", operaDate=" + operaDate +
            ", operaId=" + operaId +
            ", comboState=" + comboState +
            ", comboImage='" + comboImage + '\'' +
            ", empName='" + empName + '\'' +
            ", dolName='" + dolName + '\'' +
            '}';
  }

  public String getDolName() {
    return dolName;
  }

  public void setDolName(String dolName) {
    this.dolName = dolName;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }


  public long getDolId() {
    return dolId;
  }

  public void setDolId(long dolId) {
    this.dolId = dolId;
  }


  public long getEnlistAfterDay() {
    return enlistAfterDay;
  }

  public void setEnlistAfterDay(long enlistAfterDay) {
    this.enlistAfterDay = enlistAfterDay;
  }


  public double getAdultPrice() {
    return adultPrice;
  }

  public void setAdultPrice(double adultPrice) {
    this.adultPrice = adultPrice;
  }


  public double getChildPrice() {
    return childPrice;
  }

  public void setChildPrice(double childPrice) {
    this.childPrice = childPrice;
  }


  public double getAllowance() {
    return allowance;
  }

  public void setAllowance(double allowance) {
    this.allowance = allowance;
  }


  public String getBeginCity() {
    return beginCity;
  }

  public void setBeginCity(String beginCity) {
    this.beginCity = beginCity;
  }


  public long getCountDay() {
    return countDay;
  }

  public void setCountDay(long countDay) {
    this.countDay = countDay;
  }


  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }


  public String getIncludeInfo() {
    return includeInfo;
  }

  public void setIncludeInfo(String includeInfo) {
    this.includeInfo = includeInfo;
  }


  public String getUncludeInfo() {
    return uncludeInfo;
  }

  public void setUncludeInfo(String uncludeInfo) {
    this.uncludeInfo = uncludeInfo;
  }


  public String getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(String paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  public String getPayAttenInfo() {
    return payAttenInfo;
  }

  public void setPayAttenInfo(String payAttenInfo) {
    this.payAttenInfo = payAttenInfo;
  }


  public String getVisaInfo() {
    return visaInfo;
  }

  public void setVisaInfo(String visaInfo) {
    this.visaInfo = visaInfo;
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


  public long getComboState() {
    return comboState;
  }

  public void setComboState(long comboState) {
    this.comboState = comboState;
  }


  public String getComboImage() {
    return comboImage;
  }

  public void setComboImage(String comboImage) {
    this.comboImage = comboImage;
  }

}
