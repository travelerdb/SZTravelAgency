package com.entity;


import java.util.Date;

public class Phoneconsulttab {

  private long consultId;
  private String clientName;
  private String phone;
  private String problemInfo;
  private long consultSate;
  private long operaId;
  private Date operaDate;


  public long getConsultId() {
    return consultId;
  }

  public void setConsultId(long consultId) {
    this.consultId = consultId;
  }


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getProblemInfo() {
    return problemInfo;
  }

  public void setProblemInfo(String problemInfo) {
    this.problemInfo = problemInfo;
  }


  public long getConsultSate() {
    return consultSate;
  }

  public void setConsultSate(long consultSate) {
    this.consultSate = consultSate;
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
    return "Phoneconsulttab{" +
            "consultId=" + consultId +
            ", clientName='" + clientName + '\'' +
            ", phone='" + phone + '\'' +
            ", problemInfo='" + problemInfo + '\'' +
            ", consultSate=" + consultSate +
            ", operaId=" + operaId +
            ", operaDate=" + operaDate +
            '}';
  }
}
