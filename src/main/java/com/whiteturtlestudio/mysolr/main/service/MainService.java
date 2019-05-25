package com.whiteturtlestudio.mysolr.main.service;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.bos.User;
import com.whiteturtlestudio.mysolr.main.bos.Voltage;
import com.whiteturtlestudio.mysolr.main.bos.request.FromToTimestamp;
import com.whiteturtlestudio.mysolr.main.bos.request.Sensor;
import com.whiteturtlestudio.mysolr.main.bos.response.DateSaving;

public interface MainService {

  List<Current> getAllCurrent(FromToTimestamp fromToTimestamp);

  List<Voltage> getAllVoltage(FromToTimestamp fromToTimestamp);

  List<Light> getAllLight(FromToTimestamp fromToTimestamp);

  List<Humidity> getAllHumidity(FromToTimestamp fromToTimestamp);

  List<Temperature> getAllTemperature(FromToTimestamp fromToTimestamp);

  boolean saveSensorData(Sensor sensor);

  DateSaving getTodaySavings();

  DateSaving getYesterdaySavings();

  DateSaving getTodayEnergyGeneration();

  DateSaving getTotalSavings();

  boolean saveUser(User user);

  User getUser();

}
