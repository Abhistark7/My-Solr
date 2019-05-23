package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.bos.Temperature.TemperatureBuilder;
import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity;
import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity.TemperatureEntityBuilder;
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
public class TemperatureTemperatureEntityMapperImpl implements TemperatureTemperatureEntityMapper {

    @Override
    public TemperatureEntity temperatureToTemperatureEntityMapper(Temperature temperature) {
        if ( temperature == null ) {
            return null;
        }

        TemperatureEntityBuilder temperatureEntity = TemperatureEntity.builder();

        temperatureEntity.id( temperature.getId() );
        temperatureEntity.userId( temperature.getUserId() );
        temperatureEntity.value( temperature.getValue() );
        temperatureEntity.timestamp( temperature.getTimestamp() );

        return temperatureEntity.build();
    }

    @Override
    public Temperature temperatureEntityToTemperatureMapper(TemperatureEntity temperatureEntity) {
        if ( temperatureEntity == null ) {
            return null;
        }

        TemperatureBuilder temperature = Temperature.builder();

        temperature.id( temperatureEntity.getId() );
        temperature.userId( temperatureEntity.getUserId() );
        temperature.value( temperatureEntity.getValue() );
        temperature.timestamp( temperatureEntity.getTimestamp() );

        return temperature.build();
    }

    @Override
    public List<TemperatureEntity> temperatureListToTemperatureEntityList(List<Temperature> temperatureList) {
        if ( temperatureList == null ) {
            return null;
        }

        List<TemperatureEntity> list = new ArrayList<TemperatureEntity>( temperatureList.size() );
        for ( Temperature temperature : temperatureList ) {
            list.add( temperatureToTemperatureEntityMapper( temperature ) );
        }

        return list;
    }

    @Override
    public List<Temperature> temperatureEntityListToTemperatureList(List<TemperatureEntity> temperatureEntityList) {
        if ( temperatureEntityList == null ) {
            return null;
        }

        List<Temperature> list = new ArrayList<Temperature>( temperatureEntityList.size() );
        for ( TemperatureEntity temperatureEntity : temperatureEntityList ) {
            list.add( temperatureEntityToTemperatureMapper( temperatureEntity ) );
        }

        return list;
    }
}
