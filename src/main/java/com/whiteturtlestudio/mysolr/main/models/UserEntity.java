package com.whiteturtlestudio.mysolr.main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@ToString
@Table(name = "user")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Integer id;

  @Column(name = "user_id")
  String userId;

  @Column(name = "token_id")
  String tokenId;

  @Column(name = "name")
  String name;

  @Column(name = "email")
  String email;

  @Column(name = "password")
  String password;

  @Column(name = "profile_image_url")
  String profileImageUrl;

  @Column(name = "mobile_number")
  String mobileNumber;

  @Column(name = "panel_name")
  String panelName;

  @Column(name = "panel_capacity")
  String panelCapacity;

  @Column(name = "panel_capacity_unit")
  String panelCapacityUnit;

  @Column(name = "panel_age")
  String panelAge;

  @Column(name = "registered_date")
  String registeredDate;

  @Column(name = "tariff")
  String tariff;

  @Column(name = "temperature_unit")
  String temperatureUnit;
}
