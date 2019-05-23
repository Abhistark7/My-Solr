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
public class Light {
  Integer id;
  Integer userId;
  String value;
  String timestamp;
}
