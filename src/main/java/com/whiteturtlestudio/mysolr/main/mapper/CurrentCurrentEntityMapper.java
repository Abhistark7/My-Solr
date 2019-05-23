package com.whiteturtlestudio.mysolr.main.mapper;

import java.util.List;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.models.CurrentEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CurrentCurrentEntityMapper {

  List<CurrentEntity> currentListToCurrentEntityList(List<Current> currentList);

  List<Current> currentEntityListToCurrentList(List<CurrentEntity> currentEntityList);

  Current currentEntityToCurrent(CurrentEntity currentEntity);

  CurrentEntity currentToCurrentEntity(Current current);
}
