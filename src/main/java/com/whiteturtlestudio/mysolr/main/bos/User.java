package com.whiteturtlestudio.mysolr.main.bos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
  Integer id;
  Integer userId;
  String tokenId;
  String name;
  String email;
  String password;
  String profileImageUrl;
  String mobileNumber;
  String panelName;
  String panelCapacity;
  String panelCapacityUnit;
  String panelAge;
  String registeredDate;
  String tariff;
  String temperatureUnit;
}
