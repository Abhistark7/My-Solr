package com.whiteturtlestudio.mysolr.main.bos.request;

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
public class FromToTimestamp {
  String fromTimestamp;
  String toTimestamp;
}
