package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;
import java.util.Optional;

import com.whiteturtlestudio.mysolr.main.models.CurrentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentRepository extends JpaRepository<CurrentEntity, Integer> {

  Optional<CurrentEntity> findCurrentByUserId(Integer userId);

  List<CurrentEntity> findAll();

  CurrentEntity save(CurrentEntity currentEntity);

  void deleteById(Integer id);
}
