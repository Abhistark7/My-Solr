package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;
import java.util.Optional;

import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureEntity, Integer> {

  Optional<TemperatureEntity> findTemperatureByUserId(Integer userId);

  List<TemperatureEntity> findAll();

  TemperatureEntity save(TemperatureEntity currentEntity);

  void deleteById(Integer id);
}
