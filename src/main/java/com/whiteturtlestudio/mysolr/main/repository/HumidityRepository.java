package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;
import java.util.Optional;

import com.whiteturtlestudio.mysolr.main.models.HumidityEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumidityRepository extends JpaRepository<HumidityEntity, Integer> {

  Optional<HumidityEntity> findHumidityByUserId(Integer userId);

  List<HumidityEntity> findAll();

  HumidityEntity save(HumidityEntity humidityEntity);

  void deleteById(Integer id);
}
