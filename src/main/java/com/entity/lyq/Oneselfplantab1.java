package com.entity.lyq;


import java.util.Date;

public class Oneselfplantab1 {

  private long planId;
  private long clientId;
  private long needId;
  private String routeInfo;
  private String wayInfo;
  private String trafficInfo;
  private String taverbInfo;
  private double expectPay;
  private long planState;
  private long operaId;
  private Date operaDate;
  private String name;
  private String empName;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public long getPlanId() {
    return planId;
  }

  public void setPlanId(long planId) {
    this.planId = planId;
  }


  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public long getNeedId() {
    return needId;
  }

  public void setNeedId(long needId) {
    this.needId = needId;
  }


  public String getRouteInfo() {
    return routeInfo;
  }

  public void setRouteInfo(String routeInfo) {
    this.routeInfo = routeInfo;
  }


  public String getWayInfo() {
    return wayInfo;
  }

  public void setWayInfo(String wayInfo) {
    this.wayInfo = wayInfo;
  }


  public String getTrafficInfo() {
    return trafficInfo;
  }

  public void setTrafficInfo(String trafficInfo) {
    this.trafficInfo = trafficInfo;
  }


  public String getTaverbInfo() {
    return taverbInfo;
  }

  public void setTaverbInfo(String taverbInfo) {
    this.taverbInfo = taverbInfo;
  }


  public double getExpectPay() {
    return expectPay;
  }

  public void setExpectPay(double expectPay) {
    this.expectPay = expectPay;
  }


  public long getPlanState() {
    return planState;
  }

  public void setPlanState(long planState) {
    this.planState = planState;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }


  public Date getOperaDate() {
    return operaDate;
  }

  public void setOperaDate(Date operaDate) {
    this.operaDate = operaDate;
  }

  @Override
  public String toString() {
    return "Oneselfplantab1{" +
            "planId=" + planId +
            ", clientId=" + clientId +
            ", needId=" + needId +
            ", routeInfo='" + routeInfo + '\'' +
            ", wayInfo='" + wayInfo + '\'' +
            ", trafficInfo='" + trafficInfo + '\'' +
            ", taverbInfo='" + taverbInfo + '\'' +
            ", expectPay=" + expectPay +
            ", planState=" + planState +
            ", operaId=" + operaId +
            ", operaDate=" + operaDate +
            ", name='" + name + '\'' +
            ", empName='" + empName + '\'' +
            '}';
  }
}
