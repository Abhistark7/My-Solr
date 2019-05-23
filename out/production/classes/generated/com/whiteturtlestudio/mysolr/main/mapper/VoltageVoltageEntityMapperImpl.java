package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Voltage;
import com.whiteturtlestudio.mysolr.main.models.VoltageEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-19T19:59:03+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class VoltageVoltageEntityMapperImpl implements VoltageVoltageEntityMapper {

    @Override
    public VoltageEntity voltageToVoltageEntity(Voltage voltage) {
        if ( voltage == null ) {
            return null;
        }

        VoltageEntity voltageEntity = new VoltageEntity();

        voltageEntity.setId( voltage.getId() );
        voltageEntity.setUserId( voltage.getUserId() );
        voltageEntity.setValue( voltage.getValue() );
        voltageEntity.setTimestamp( voltage.getTimestamp() );

        return voltageEntity;
    }

    @Override
    public Voltage voltageEntityToVoltage(VoltageEntity voltageEntity) {
        if ( voltageEntity == null ) {
            return null;
        }

        Voltage voltage = new Voltage();

        voltage.setId( voltageEntity.getId() );
        voltage.setUserId( voltageEntity.getUserId() );
        voltage.setValue( voltageEntity.getValue() );
        voltage.setTimestamp( voltageEntity.getTimestamp() );

        return voltage;
    }
}
