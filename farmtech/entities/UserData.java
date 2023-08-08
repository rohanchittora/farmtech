package com.farmtech.farmtech.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String adhaarId;
  private String userName;
  private String homeStreetAddress;
  private String homeZipCode;
  private String homeState;
  private String homeCity;
  private String agriStreetAddress;
  private String agriZipCode;
  private String agriState;
  private String agriCity;
  private double agriLandSize;

  public UserData(
      long id,
      String adhaarId,
      String userName,
      String homeStreetAddress,
      String homeZipCode,
      String homeState,
      String homeCity,
      String agriStreetAddress,
      String agriZipCode,
      String agriState,
      String agriCity,
      double agriLandSize) {
    this.id = id;
    this.adhaarId = adhaarId;
    this.userName = userName;
    this.homeStreetAddress = homeStreetAddress;
    this.homeZipCode = homeZipCode;
    this.homeState = homeState;
    this.homeCity = homeCity;
    this.agriStreetAddress = agriStreetAddress;
    this.agriZipCode = agriZipCode;
    this.agriState = agriState;
    this.agriCity = agriCity;
    this.agriLandSize = agriLandSize;
  }

  public UserData() {
    super();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAdhaarId() {
    return adhaarId;
  }

  public void setAdhaarId(String adhaarId) {
    this.adhaarId = adhaarId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getHomeStreetAddress() {
    return homeStreetAddress;
  }

  public void setHomeStreetAddress(String homeStreetAddress) {
    this.homeStreetAddress = homeStreetAddress;
  }

  public String getHomeZipCode() {
    return homeZipCode;
  }

  public void setHomeZipCode(String homeZipCode) {
    this.homeZipCode = homeZipCode;
  }

  public String getHomeState() {
    return homeState;
  }

  public void setHomeState(String homeState) {
    this.homeState = homeState;
  }

  public String getHomeCity() {
    return homeCity;
  }

  public void setHomeCity(String homeCity) {
    this.homeCity = homeCity;
  }

  public String getAgriStreetAddress() {
    return agriStreetAddress;
  }

  public void setAgriStreetAddress(String agriStreetAddress) {
    this.agriStreetAddress = agriStreetAddress;
  }

  public String getAgriZipCode() {
    return agriZipCode;
  }

  public void setAgriZipCode(String agriZipCode) {
    this.agriZipCode = agriZipCode;
  }

  public String getAgriState() {
    return agriState;
  }

  public void setAgriState(String agriState) {
    this.agriState = agriState;
  }

  public String getAgriCity() {
    return agriCity;
  }

  public void setAgriCity(String agriCity) {
    this.agriCity = agriCity;
  }

  public double getAgriLandSize() {
    return agriLandSize;
  }

  public void setAgriLandSize(double agriLandSize) {
    this.agriLandSize = agriLandSize;
  }

  @Override
  public String toString() {
    return "UserData{"
        + "id="
        + id
        + ", adhaarId='"
        + adhaarId
        + '\''
        + ", userName='"
        + userName
        + '\''
        + ", homeStreetAddress='"
        + homeStreetAddress
        + '\''
        + ", homeZipCode='"
        + homeZipCode
        + '\''
        + ", homeState='"
        + homeState
        + '\''
        + ", homeCity='"
        + homeCity
        + '\''
        + ", agriStreetAddress='"
        + agriStreetAddress
        + '\''
        + ", agriZipCode='"
        + agriZipCode
        + '\''
        + ", agriState='"
        + agriState
        + '\''
        + ", agriCity='"
        + agriCity
        + '\''
        + ", agriLandSize="
        + agriLandSize
        + '}';
  }
}
