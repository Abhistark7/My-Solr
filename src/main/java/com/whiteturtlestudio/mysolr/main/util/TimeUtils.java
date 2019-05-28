package com.whiteturtlestudio.mysolr.main.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeUtils {
  private static final String TIMESTAMP_FORMAT = "dd-MM-yyyy HH:mm:ss";
  private static final String TIMESTAMP_SLASH_FORMAT = "yyyy/MM/dd HH:mm:ss";
  private static final String DATE_FORMAT = "dd-MM-yyyy";
  private static final String TIME_FORMAT = " 00:00:00";
  private static final int THOUSAND = 1000;
  private static final int ONE = 1;

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
    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
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

  public static String getTodayDateString() {
    Date todayDate = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
    String todayDateString = simpleDateFormat.format(todayDate);
    return todayDateString + TIME_FORMAT;
  }

  public static String getYesterdayDateString() {
    DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    return dateFormat.format(yesterday()) + TIME_FORMAT;
  }

  public static String getTomorrowDateString() {
    DateFormat dateFormat = new SimpleDateFormat(TIMESTAMP_SLASH_FORMAT);
    return dateFormat.format(tomorrow()) + TIME_FORMAT;
  }

  public static Date yesterday() {
    final Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, -ONE);
    return cal.getTime();
  }

  public static Date tomorrow() {
    final Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, +ONE);
    return cal.getTime();

  }

  public static long getDateStartTimestamp(String date) {
    long todayStartTimestamp = 0;
    SimpleDateFormat simpleTimestampFormat = new SimpleDateFormat(TIMESTAMP_FORMAT);
    try {
      Date todayDateTimestamp = simpleTimestampFormat.parse(date);
      todayStartTimestamp = todayDateTimestamp.getTime() / THOUSAND;
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return todayStartTimestamp;
  }
}
