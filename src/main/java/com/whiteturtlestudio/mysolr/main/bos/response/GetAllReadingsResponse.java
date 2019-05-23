package com.whiteturtlestudio.mysolr.main.bos.response;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.bos.Voltage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GetAllReadingsResponse extends BaseResponse {
  List<Current> currentList;
  List<Voltage> voltageList;
  List<Light> lightList;
  List<Humidity> humidityList;
  List<Temperature> temperatureList;
}
