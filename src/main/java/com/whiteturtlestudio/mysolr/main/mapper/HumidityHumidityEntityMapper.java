package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.models.HumidityEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HumidityHumidityEntityMapper {

  HumidityEntity humidityToHumidityEntityMapper(Humidity humidity);

  Humidity humidityEntityToHumidityMapper(HumidityEntity humidityEntity);

  List<HumidityEntity> humidityListToHumidiyEntityListMapper(List<Humidity> humidityList);

  List<Humidity> humidityEntityListToHumidityList(List<HumidityEntity> humidityEntityList);
}
