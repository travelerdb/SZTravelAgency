package com.entity;


import java.util.Date;

public class Empaccount {

  private long accId;
  private String accNum;
  private String password;
  private long empId;
  private long operaId;
  private Date operaDate;


  public long getAccId() {
    return accId;
  }

  public void setAccId(long accId) {
    this.accId = accId;
  }


  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
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
    return "Empaccount{" +
            "accId=" + accId +
            ", accNum='" + accNum + '\'' +
            ", password='" + password + '\'' +
            ", empId=" + empId +
            ", operaId=" + operaId +
            ", operaDate=" + operaDate +
            '}';
  }
}
