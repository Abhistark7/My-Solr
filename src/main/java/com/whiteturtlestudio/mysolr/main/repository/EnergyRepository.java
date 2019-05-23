package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.models.EnergyEntity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author abhisheksahu created at 2019-05-21
 */
public interface EnergyRepository extends JpaRepository<EnergyEntity, Integer> {
  List<EnergyEntity> findEnergyByUserId(Integer userId);

  List<EnergyEntity> findAll();

  EnergyEntity save(EnergyEntity energyEntity);

  void deleteById(Integer id);
}
