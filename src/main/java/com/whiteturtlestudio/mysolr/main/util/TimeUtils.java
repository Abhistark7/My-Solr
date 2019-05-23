package com.whiteturtlestudio.mysolr.main.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class TimeUtils {
  private static final String TIMESTAMP_FORMAT = "dd-MM-yyyy HH:mm:ss";
  private static final int THOUSAND = 1000;

  public static String getDateTimeFromUnixTimestamp(String unixTimeStamp) {
    Date date = Date.from(Instant.ofEpochSecond(Long.valueOf(unixTimeStamp)));
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIMESTAMP_FORMAT);
    return simpleDateFormat.format(date);
  }

  public static long getUnixTimestampFromDateTime(String dateTime) {
    Date date = new Date();
    try {
      date = new SimpleDateFormat(TIMESTAMP_FORMAT).parse(dateTime);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date.getTime() / THOUSAND;
  }
}
