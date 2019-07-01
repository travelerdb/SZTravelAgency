package com.entity.lyq;


import java.io.Serializable;
import java.util.Date;

public class Emptab1 implements Serializable {

  private long empId;
  private String empName;
  private String idCard;
  private String phone;
  private String address;
  private Date entryDate;
  private long operaId;
  private String sex;
  private long empState;
  private long roleId;
  private Roletab1 role;

  public long getEmpId() {
    return empId;
  }

  public void setEmpId(long empId) {
    this.empId = empId;
  }


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Date getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(Date entryDate) {
    this.entryDate = entryDate;
  }


  public long getOperaId() {
    return operaId;
  }

  public void setOperaId(long operaId) {
    this.operaId = operaId;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public long getEmpState() {
    return empState;
  }

  public void setEmpState(long empState) {
    this.empState = empState;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

  public Roletab1 getRole() {
    return role;
  }

  public void setRole(Roletab1 role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Emptab1{" +
            "empId=" + empId +
            ", empName='" + empName + '\'' +
            ", idCard='" + idCard + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", entryDate=" + entryDate +
            ", operaId=" + operaId +
            ", sex='" + sex + '\'' +
            ", empState=" + empState +
            ", roleId=" + roleId +
            ", role=" + role +
            '}';
  }
}
