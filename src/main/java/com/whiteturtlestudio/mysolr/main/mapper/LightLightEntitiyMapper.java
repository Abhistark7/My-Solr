package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.models.LightEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LightLightEntitiyMapper {

  LightEntity lightToLightEntityMapper(Light light);

  Light lightEntityToLightMapper(LightEntity lightEntity);

  List<LightEntity> lightListToLightEntityList(List<Light> lightList);

  List<Light> lightEntityListToLightList(List<LightEntity> lightEntityList);
}
