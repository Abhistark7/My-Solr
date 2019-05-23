package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-19T19:59:03+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class TemperatureTemperatureEntityMapperImpl implements TemperatureTemperatureEntityMapper {

    @Override
    public TemperatureEntity temperatureToTemperatureEntityMapper(Temperature temperature) {
        if ( temperature == null ) {
            return null;
        }

        TemperatureEntity temperatureEntity = new TemperatureEntity();

        temperatureEntity.setId( temperature.getId() );
        temperatureEntity.setUserId( temperature.getUserId() );
        temperatureEntity.setValue( temperature.getValue() );
        temperatureEntity.setTimestamp( temperature.getTimestamp() );

        return temperatureEntity;
    }

    @Override
    public Temperature temperatureEntityToTemperatureMapper(TemperatureEntity temperatureEntity) {
        if ( temperatureEntity == null ) {
            return null;
        }

        Temperature temperature = new Temperature();

        temperature.setId( temperatureEntity.getId() );
        temperature.setUserId( temperatureEntity.getUserId() );
        temperature.setValue( temperatureEntity.getValue() );
        temperature.setTimestamp( temperatureEntity.getTimestamp() );

        return temperature;
    }
}
