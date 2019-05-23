package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Voltage;
import com.whiteturtlestudio.mysolr.main.bos.Voltage.VoltageBuilder;
import com.whiteturtlestudio.mysolr.main.models.VoltageEntity;
import com.whiteturtlestudio.mysolr.main.models.VoltageEntity.VoltageEntityBuilder;
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
public class VoltageVoltageEntityMapperImpl implements VoltageVoltageEntityMapper {

    @Override
    public VoltageEntity voltageToVoltageEntity(Voltage voltage) {
        if ( voltage == null ) {
            return null;
        }

        VoltageEntityBuilder voltageEntity = VoltageEntity.builder();

        voltageEntity.id( voltage.getId() );
        voltageEntity.userId( voltage.getUserId() );
        voltageEntity.value( voltage.getValue() );
        voltageEntity.timestamp( voltage.getTimestamp() );

        return voltageEntity.build();
    }

    @Override
    public Voltage voltageEntityToVoltage(VoltageEntity voltageEntity) {
        if ( voltageEntity == null ) {
            return null;
        }

        VoltageBuilder voltage = Voltage.builder();

        voltage.id( voltageEntity.getId() );
        voltage.userId( voltageEntity.getUserId() );
        voltage.value( voltageEntity.getValue() );
        voltage.timestamp( voltageEntity.getTimestamp() );

        return voltage.build();
    }

    @Override
    public List<Voltage> volageEntityListToVoltageList(List<VoltageEntity> voltageEntity) {
        if ( voltageEntity == null ) {
            return null;
        }

        List<Voltage> list = new ArrayList<Voltage>( voltageEntity.size() );
        for ( VoltageEntity voltageEntity1 : voltageEntity ) {
            list.add( voltageEntityToVoltage( voltageEntity1 ) );
        }

        return list;
    }

    @Override
    public List<VoltageEntity> voltageListToVoltageEntityList(List<Voltage> voltageList) {
        if ( voltageList == null ) {
            return null;
        }

        List<VoltageEntity> list = new ArrayList<VoltageEntity>( voltageList.size() );
        for ( Voltage voltage : voltageList ) {
            list.add( voltageToVoltageEntity( voltage ) );
        }

        return list;
    }
}
