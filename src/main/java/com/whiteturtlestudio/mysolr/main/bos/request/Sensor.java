package com.whiteturtlestudio.mysolr.main.bos.request;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.bos.Voltage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author abhisheksahu created at 2019-05-19
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Sensor {
  Current current;
  Voltage voltage;
  Temperature temperature;
  Humidity humidity;
  Light light;
}
