package com.entity;


import java.util.Date;

public class Issuecombotab {

  private long issComId;
  private long comboId;
  private long joinCount;
  private Date departDate;
  private long joinClient;
  private long overplusTicket;
  private Date operaDate;
  private long operaId;


  public long getIssComId() {
    return issComId;
  }

  public void setIssComId(long issComId) {
    this.issComId = issComId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public long getJoinCount() {
    return joinCount;
  }

  public void setJoinCount(long joinCount) {
    this.joinCount = joinCount;
  }


  public Date getDepartDate() {
    return departDate;
  }

  public void setDepartDate(Date departDate) {
    this.departDate = departDate;
  }


  public long getJoinClient() {
    return joinClient;
  }

  public void setJoinClient(long joinClient) {
    this.joinClient = joinClient;
  }


  public long getOverplusTicket() {
    return overplusTicket;
  }

  public void setOverplusTicket(long overplusTicket) {
    this.overplusTicket = overplusTicket;
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
    return "Issuecombotab{" +
            "issComId=" + issComId +
            ", comboId=" + comboId +
            ", joinCount=" + joinCount +
            ", departDate=" + departDate +
            ", joinClient=" + joinClient +
            ", overplusTicket=" + overplusTicket +
            ", operaDate=" + operaDate +
            ", operaId=" + operaId +
            '}';
  }
}
