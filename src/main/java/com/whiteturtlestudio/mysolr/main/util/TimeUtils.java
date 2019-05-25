package com.whiteturtlestudio.mysolr.main.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

  public static long getNoOfDaysBetweenDates(String startDate, String endDate) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    try {
      Date date1 = dateFormat.parse(startDate);
      Date date2 = dateFormat.parse(endDate);
      long diff = date2.getTime() - date1.getTime();
      return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return 0;
  }
}
