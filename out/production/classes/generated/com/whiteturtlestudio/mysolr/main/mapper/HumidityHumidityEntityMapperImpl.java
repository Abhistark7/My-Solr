package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.models.HumidityEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-19T19:59:03+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class HumidityHumidityEntityMapperImpl implements HumidityHumidityEntityMapper {

    @Override
    public HumidityEntity humidityToHumidityEntityMapper(Humidity humidity) {
        if ( humidity == null ) {
            return null;
        }

        HumidityEntity humidityEntity = new HumidityEntity();

        humidityEntity.setId( humidity.getId() );
        humidityEntity.setUserId( humidity.getUserId() );
        humidityEntity.setValue( humidity.getValue() );
        humidityEntity.setTimestamp( humidity.getTimestamp() );

        return humidityEntity;
    }

    @Override
    public Humidity humidityEntityToHumidityMapper(HumidityEntity humidityEntity) {
        if ( humidityEntity == null ) {
            return null;
        }

        Humidity humidity = new Humidity();

        humidity.setId( humidityEntity.getId() );
        humidity.setUserId( humidityEntity.getUserId() );
        humidity.setValue( humidityEntity.getValue() );
        humidity.setTimestamp( humidityEntity.getTimestamp() );

        return humidity;
    }
}
