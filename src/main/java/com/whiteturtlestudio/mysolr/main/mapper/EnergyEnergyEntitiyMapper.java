package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Energy;
import com.whiteturtlestudio.mysolr.main.models.EnergyEntity;

import org.mapstruct.Mapper;

/**
 * @author abhisheksahu created at 2019-05-22
 */
@Mapper(componentModel = "spring")
public interface EnergyEnergyEntitiyMapper {
  List<EnergyEntity> energyListToEnergyEntityList(List<Energy> energyList);

  List<Energy> energyEntityListToEnergyList(List<EnergyEntity> energyEntityList);

  Energy energyEntityToEnergy(EnergyEntity energyEntity);

  EnergyEntity energyToEnergyEntity(Energy energy);
}
