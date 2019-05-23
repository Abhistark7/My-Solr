package com.whiteturtlestudio.mysolr.main.bos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abhisheksahu created at 2019-05-21
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DateSaving {
  String date;
  String savings;
}
