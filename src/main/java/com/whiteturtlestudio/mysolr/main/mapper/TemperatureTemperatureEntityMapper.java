package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TemperatureTemperatureEntityMapper {

  TemperatureEntity temperatureToTemperatureEntityMapper(Temperature temperature);

  Temperature temperatureEntityToTemperatureMapper(TemperatureEntity temperatureEntity);

  List<TemperatureEntity> temperatureListToTemperatureEntityList(List<Temperature> temperatureList);

  List<Temperature> temperatureEntityListToTemperatureList(List<TemperatureEntity> temperatureEntityList);
}
