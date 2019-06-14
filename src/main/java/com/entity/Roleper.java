package com.entity;


public class Roleper {

  private long rpId;
  private long roleId;
  private long perId;


  public long getRpId() {
    return rpId;
  }

  public void setRpId(long rpId) {
    this.rpId = rpId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getPerId() {
    return perId;
  }

  public void setPerId(long perId) {
    this.perId = perId;
  }

  @Override
  public String toString() {
    return "Roleper{" +
            "rpId=" + rpId +
            ", roleId=" + roleId +
            ", perId=" + perId +
            '}';
  }
}
