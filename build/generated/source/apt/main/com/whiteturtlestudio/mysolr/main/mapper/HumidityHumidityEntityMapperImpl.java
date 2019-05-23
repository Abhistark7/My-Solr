package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.bos.Humidity.HumidityBuilder;
import com.whiteturtlestudio.mysolr.main.models.HumidityEntity;
import com.whiteturtlestudio.mysolr.main.models.HumidityEntity.HumidityEntityBuilder;
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
public class HumidityHumidityEntityMapperImpl implements HumidityHumidityEntityMapper {

    @Override
    public HumidityEntity humidityToHumidityEntityMapper(Humidity humidity) {
        if ( humidity == null ) {
            return null;
        }

        HumidityEntityBuilder humidityEntity = HumidityEntity.builder();

        humidityEntity.id( humidity.getId() );
        humidityEntity.userId( humidity.getUserId() );
        humidityEntity.value( humidity.getValue() );
        humidityEntity.timestamp( humidity.getTimestamp() );

        return humidityEntity.build();
    }

    @Override
    public Humidity humidityEntityToHumidityMapper(HumidityEntity humidityEntity) {
        if ( humidityEntity == null ) {
            return null;
        }

        HumidityBuilder humidity = Humidity.builder();

        humidity.id( humidityEntity.getId() );
        humidity.userId( humidityEntity.getUserId() );
        humidity.value( humidityEntity.getValue() );
        humidity.timestamp( humidityEntity.getTimestamp() );

        return humidity.build();
    }

    @Override
    public List<HumidityEntity> humidityListToHumidiyEntityListMapper(List<Humidity> humidityList) {
        if ( humidityList == null ) {
            return null;
        }

        List<HumidityEntity> list = new ArrayList<HumidityEntity>( humidityList.size() );
        for ( Humidity humidity : humidityList ) {
            list.add( humidityToHumidityEntityMapper( humidity ) );
        }

        return list;
    }

    @Override
    public List<Humidity> humidityEntityListToHumidityList(List<HumidityEntity> humidityEntityList) {
        if ( humidityEntityList == null ) {
            return null;
        }

        List<Humidity> list = new ArrayList<Humidity>( humidityEntityList.size() );
        for ( HumidityEntity humidityEntity : humidityEntityList ) {
            list.add( humidityEntityToHumidityMapper( humidityEntity ) );
        }

        return list;
    }
}
