package com.whiteturtlestudio.mysolr.main.repository;

import com.whiteturtlestudio.mysolr.main.models.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author abhisheksahu created at 2019-05-22
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
  UserEntity findUserByUserId(Integer userId);

  void deleteById(Integer id);
}
