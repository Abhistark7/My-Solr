package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.models.LightEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-19T19:59:03+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class LightLightEntitiyMapperImpl implements LightLightEntitiyMapper {

    @Override
    public LightEntity lightToLightEntityMapper(Light light) {
        if ( light == null ) {
            return null;
        }

        LightEntity lightEntity = new LightEntity();

        lightEntity.setId( light.getId() );
        lightEntity.setUserId( light.getUserId() );
        lightEntity.setValue( light.getValue() );
        lightEntity.setTimestamp( light.getTimestamp() );

        return lightEntity;
    }

    @Override
    public Light lightEntityToLightMapper(LightEntity lightEntity) {
        if ( lightEntity == null ) {
            return null;
        }

        Light light = new Light();

        light.setId( lightEntity.getId() );
        light.setUserId( lightEntity.getUserId() );
        light.setValue( lightEntity.getValue() );
        light.setTimestamp( lightEntity.getTimestamp() );

        return light;
    }
}
