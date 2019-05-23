package com.whiteturtlestudio.mysolr.main.repository;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.models.SavingsEntity;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author abhisheksahu created at 2019-05-22
 */
public interface SavingsRepository extends JpaRepository<SavingsEntity, Integer> {
  List<SavingsEntity> findSavingsByUserId(Integer userId);

  List<SavingsEntity> findAll();

  SavingsEntity save(SavingsEntity savingsEntity);

  void deleteById(Integer id);
}
