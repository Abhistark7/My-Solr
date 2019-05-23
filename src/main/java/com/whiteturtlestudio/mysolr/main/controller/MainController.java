package com.whiteturtlestudio.mysolr.main.controller;

import com.whiteturtlestudio.mysolr.main.bos.User;
import com.whiteturtlestudio.mysolr.main.bos.request.FromToTimestamp;
import com.whiteturtlestudio.mysolr.main.bos.request.Sensor;
import com.whiteturtlestudio.mysolr.main.bos.response.BaseResponse;
import com.whiteturtlestudio.mysolr.main.bos.response.DateSaving;
import com.whiteturtlestudio.mysolr.main.bos.response.GetAllReadingsResponse;
import com.whiteturtlestudio.mysolr.main.constants.Constants;
import com.whiteturtlestudio.mysolr.main.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my-solr")
public class MainController {

  @Autowired
  MainService mainService;

  @RequestMapping(value = "/getAllReadings", method = RequestMethod.POST)
  public ResponseEntity<GetAllReadingsResponse> getAllReadings(@RequestBody FromToTimestamp fromToTimestamp) {
    GetAllReadingsResponse getAllReadingsResponse = new GetAllReadingsResponse();
    getAllReadingsResponse.setCurrentList(mainService.getAllCurrent(fromToTimestamp));
    getAllReadingsResponse.setVoltageList(mainService.getAllVoltage(fromToTimestamp));
    getAllReadingsResponse.setLightList(mainService.getAllLight(fromToTimestamp));
    getAllReadingsResponse.setHumidityList(mainService.getAllHumidity(fromToTimestamp));
    getAllReadingsResponse.setTemperatureList(mainService.getAllTemperature(fromToTimestamp));
    getAllReadingsResponse.setMessage(Constants.SUCCESS);
    getAllReadingsResponse.setStatus(true);
    getAllReadingsResponse.setCode(Constants.HTTP_SUCCESS_CODE);
    return new ResponseEntity<>(getAllReadingsResponse, HttpStatus.OK);
  }

  @RequestMapping(value = "/saveSensorData", method = RequestMethod.POST)
  public ResponseEntity<BaseResponse> saveSensorData(@RequestBody Sensor sensor) {
    mainService.saveSensorData(sensor);
    BaseResponse baseResponse = new BaseResponse();
    baseResponse.setMessage(Constants.SUCCESS);
    baseResponse.setCode(Constants.HTTP_SUCCESS_CODE);
    baseResponse.setStatus(true);
    return new ResponseEntity<>(baseResponse, HttpStatus.OK);
  }

  @RequestMapping(value = "/getTodaySavings", method = RequestMethod.GET)
  public ResponseEntity<DateSaving> getTodaySavings() {
    return new ResponseEntity<>(mainService.getTodaySavings(), HttpStatus.OK);
  }

  @RequestMapping(value = "/getYesterdaySavings", method = RequestMethod.GET)
  private ResponseEntity<DateSaving> getYesterdaySavings() {
    return new ResponseEntity<>(mainService.getYesterdaySavings(), HttpStatus.OK);
  }

  @RequestMapping(value = "/getTodayEnergyGeneration", method = RequestMethod.GET)
  private ResponseEntity<DateSaving> getTodayEnergyEnergyGeneration() {
    return new ResponseEntity<>(mainService.getTodayEnergyGeneration(), HttpStatus.OK);
  }

  @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
  private ResponseEntity<BaseResponse> saveUser(@RequestBody User user) {
    mainService.saveUser(user);
    return new ResponseEntity<>(BaseResponse.builder()
            .status(true)
            .message(Constants.SUCCESS)
            .build(), HttpStatus.OK);
  }

  @RequestMapping(value = "/getUser", method = RequestMethod.GET)
  private ResponseEntity<User> getUser() {
    return new ResponseEntity<>(mainService.getUser(), HttpStatus.OK);
  }
}
