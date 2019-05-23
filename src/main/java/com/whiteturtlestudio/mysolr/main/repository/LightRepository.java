package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;
import java.util.Optional;

import com.whiteturtlestudio.mysolr.main.models.LightEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightRepository extends JpaRepository<LightEntity, Integer> {

  Optional<LightEntity> findLightByUserId(Integer userId);

  List<LightEntity> findAll();

  LightEntity save(LightEntity lightEntity);

  void deleteById(Integer id);
}
