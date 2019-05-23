package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.models.CurrentEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-19T19:59:03+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class CurrentCurrentEntityMapperImpl implements CurrentCurrentEntityMapper {

    @Override
    public List<CurrentEntity> currentToCurrentEntity(List<Current> currentList) {
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
    public List<Current> currentEntityToCurrent(List<CurrentEntity> currentEntityList) {
        if ( currentEntityList == null ) {
            return null;
        }

        List<Current> list = new ArrayList<Current>( currentEntityList.size() );
        for ( CurrentEntity currentEntity : currentEntityList ) {
            list.add( currentEntityToCurrent( currentEntity ) );
        }

        return list;
    }

    protected CurrentEntity currentToCurrentEntity(Current current) {
        if ( current == null ) {
            return null;
        }

        CurrentEntity currentEntity = new CurrentEntity();

        currentEntity.setId( current.getId() );
        currentEntity.setUserId( current.getUserId() );
        currentEntity.setValue( current.getValue() );
        currentEntity.setTimestamp( current.getTimestamp() );

        return currentEntity;
    }

    protected Current currentEntityToCurrent(CurrentEntity currentEntity) {
        if ( currentEntity == null ) {
            return null;
        }

        Current current = new Current();

        current.setId( currentEntity.getId() );
        current.setUserId( currentEntity.getUserId() );
        current.setValue( currentEntity.getValue() );
        current.setTimestamp( currentEntity.getTimestamp() );

        return current;
    }
}
