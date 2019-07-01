package com.entity.lyq;


public class Clientab1 {

  private long clientId;
  private String name;
  private String sex;
  private String idCard;
  private String phone;
  private String email;
  private String headImage;
  private String miniName;
  private String password;

  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
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


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getHeadImage() {
    return headImage;
  }

  public void setHeadImage(String headImage) {
    this.headImage = headImage;
  }


  public String getMiniName() {
    return miniName;
  }

  public void setMiniName(String miniName) {
    this.miniName = miniName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "Clientab{" +
            "clientId=" + clientId +
            ", name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            ", idCard='" + idCard + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", headImage='" + headImage + '\'' +
            ", miniName='" + miniName + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
