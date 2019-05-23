package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;
import java.util.Optional;

import com.whiteturtlestudio.mysolr.main.models.VoltageEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoltageRepository extends JpaRepository<VoltageEntity, Integer> {

  Optional<VoltageEntity> findVoltageByUserId(Integer userId);

  List<VoltageEntity> findAll();

  VoltageEntity save(VoltageEntity voltageEntity);

  void deleteById(Integer id);
}
