package com.entity;


public class Stroketab {

  private long strokId;
  private long comboId;
  private long numDay;
  private String placeTwo;
  private String vehicle;
  private String breakfast;
  private String lunch;
  private String supper;
  private String stay;
  private String strokeInfo;


  public long getStrokId() {
    return strokId;
  }

  public void setStrokId(long strokId) {
    this.strokId = strokId;
  }


  public long getComboId() {
    return comboId;
  }

  public void setComboId(long comboId) {
    this.comboId = comboId;
  }


  public long getNumDay() {
    return numDay;
  }

  public void setNumDay(long numDay) {
    this.numDay = numDay;
  }


  public String getPlaceTwo() {
    return placeTwo;
  }

  public void setPlaceTwo(String placeTwo) {
    this.placeTwo = placeTwo;
  }


  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }


  public String getBreakfast() {
    return breakfast;
  }

  public void setBreakfast(String breakfast) {
    this.breakfast = breakfast;
  }


  public String getLunch() {
    return lunch;
  }

  public void setLunch(String lunch) {
    this.lunch = lunch;
  }


  public String getSupper() {
    return supper;
  }

  public void setSupper(String supper) {
    this.supper = supper;
  }


  public String getStay() {
    return stay;
  }

  public void setStay(String stay) {
    this.stay = stay;
  }


  public String getStrokeInfo() {
    return strokeInfo;
  }

  public void setStrokeInfo(String strokeInfo) {
    this.strokeInfo = strokeInfo;
  }

  @Override
  public String toString() {
    return "Stroketab{" +
            "strokId=" + strokId +
            ", comboId=" + comboId +
            ", numDay=" + numDay +
            ", placeTwo='" + placeTwo + '\'' +
            ", vehicle='" + vehicle + '\'' +
            ", breakfast='" + breakfast + '\'' +
            ", lunch='" + lunch + '\'' +
            ", supper='" + supper + '\'' +
            ", stay='" + stay + '\'' +
            ", strokeInfo='" + strokeInfo + '\'' +
            '}';
  }
}
