package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Energy;
import com.whiteturtlestudio.mysolr.main.bos.Energy.EnergyBuilder;
import com.whiteturtlestudio.mysolr.main.models.EnergyEntity;
import com.whiteturtlestudio.mysolr.main.models.EnergyEntity.EnergyEntityBuilder;
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
public class EnergyEnergyEntitiyMapperImpl implements EnergyEnergyEntitiyMapper {

    @Override
    public List<EnergyEntity> energyListToEnergyEntityList(List<Energy> energyList) {
        if ( energyList == null ) {
            return null;
        }

        List<EnergyEntity> list = new ArrayList<EnergyEntity>( energyList.size() );
        for ( Energy energy : energyList ) {
            list.add( energyToEnergyEntity( energy ) );
        }

        return list;
    }

    @Override
    public List<Energy> energyEntityListToEnergyList(List<EnergyEntity> energyEntityList) {
        if ( energyEntityList == null ) {
            return null;
        }

        List<Energy> list = new ArrayList<Energy>( energyEntityList.size() );
        for ( EnergyEntity energyEntity : energyEntityList ) {
            list.add( energyEntityToEnergy( energyEntity ) );
        }

        return list;
    }

    @Override
    public Energy energyEntityToEnergy(EnergyEntity energyEntity) {
        if ( energyEntity == null ) {
            return null;
        }

        EnergyBuilder energy = Energy.builder();

        energy.id( energyEntity.getId() );
        energy.userId( energyEntity.getUserId() );
        energy.value( energyEntity.getValue() );

        return energy.build();
    }

    @Override
    public EnergyEntity energyToEnergyEntity(Energy energy) {
        if ( energy == null ) {
            return null;
        }

        EnergyEntityBuilder energyEntity = EnergyEntity.builder();

        energyEntity.id( energy.getId() );
        energyEntity.userId( energy.getUserId() );
        energyEntity.value( energy.getValue() );

        return energyEntity.build();
    }
}
