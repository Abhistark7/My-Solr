package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.User;
import com.whiteturtlestudio.mysolr.main.models.UserEntity;

import org.mapstruct.Mapper;

/**
 * @author abhisheksahu created at 2019-05-23
 */
@Mapper(componentModel = "spring")
public interface UserUserEntityMapper {

  UserEntity userToUserEntity(User user);

  User userEntityToUser(UserEntity userEntity);
}
