package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.bos.Current.CurrentBuilder;
import com.whiteturtlestudio.mysolr.main.models.CurrentEntity;
import com.whiteturtlestudio.mysolr.main.models.CurrentEntity.CurrentEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-23T00:01:08+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class CurrentCurrentEntityMapperImpl implements CurrentCurrentEntityMapper {

    @Override
    public List<CurrentEntity> currentListToCurrentEntityList(List<Current> currentList) {
        if ( currentList == null ) {
            return null;
        }

        List<CurrentEntity> list = new ArrayList<CurrentEntity>( currentList.size() );
        for ( Current current : currentList ) {
            list.add( currentToCurrentEntity( current ) );
        }

        return list;
    }

    @Override
    public List<Current> currentEntityListToCurrentList(List<CurrentEntity> currentEntityList) {
        if ( currentEntityList == null ) {
            return null;
        }

        List<Current> list = new ArrayList<Current>( currentEntityList.size() );
        for ( CurrentEntity currentEntity : currentEntityList ) {
            list.add( currentEntityToCurrent( currentEntity ) );
        }

        return list;
    }

    @Override
    public Current currentEntityToCurrent(CurrentEntity currentEntity) {
        if ( currentEntity == null ) {
            return null;
        }

        CurrentBuilder current = Current.builder();

        current.id( currentEntity.getId() );
        current.userId( currentEntity.getUserId() );
        current.value( currentEntity.getValue() );
        current.timestamp( currentEntity.getTimestamp() );

        return current.build();
    }

    @Override
    public CurrentEntity currentToCurrentEntity(Current current) {
        if ( current == null ) {
            return null;
        }

        CurrentEntityBuilder currentEntity = CurrentEntity.builder();

        currentEntity.id( current.getId() );
        currentEntity.userId( current.getUserId() );
        currentEntity.value( current.getValue() );
        currentEntity.timestamp( current.getTimestamp() );

        return currentEntity.build();
    }
}
