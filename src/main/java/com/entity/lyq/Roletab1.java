package com.entity.lyq;


public class Roletab1 {

  private long roleId;
  private String roleName;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  @Override
  public String toString() {
    return "Roletab{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            '}';
  }
}
