package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Voltage;
import com.whiteturtlestudio.mysolr.main.models.VoltageEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VoltageVoltageEntityMapper {

  VoltageEntity voltageToVoltageEntity(Voltage voltage);

  Voltage voltageEntityToVoltage(VoltageEntity voltageEntity);

  List<Voltage> volageEntityListToVoltageList(List<VoltageEntity> voltageEntity);

  List<VoltageEntity> voltageListToVoltageEntityList(List<Voltage> voltageList);
}
