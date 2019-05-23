package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Savings;
import com.whiteturtlestudio.mysolr.main.models.SavingsEntity;

import org.mapstruct.Mapper;

/**
 * @author abhisheksahu created at 2019-05-22
 */
@Mapper(componentModel = "spring")
public interface SavingsSavingsEntityMapper {
  SavingsEntity savingsToSavingsEntityMapper(Savings savings);

  Savings savingsEntityToSavingsMapper(SavingsEntity savingsEntity);

  List<Savings> savingsEntityListToSavingsListMapper(List<SavingsEntity> savingsEntityList);

  List<SavingsEntity> savingsListToSavingsEntityMapper(List<Savings> savingsList);
}
