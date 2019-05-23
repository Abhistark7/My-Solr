package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.bos.Light.LightBuilder;
import com.whiteturtlestudio.mysolr.main.models.LightEntity;
import com.whiteturtlestudio.mysolr.main.models.LightEntity.LightEntityBuilder;
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
public class LightLightEntitiyMapperImpl implements LightLightEntitiyMapper {

    @Override
    public LightEntity lightToLightEntityMapper(Light light) {
        if ( light == null ) {
            return null;
        }

        LightEntityBuilder lightEntity = LightEntity.builder();

        lightEntity.id( light.getId() );
        lightEntity.userId( light.getUserId() );
        lightEntity.value( light.getValue() );
        lightEntity.timestamp( light.getTimestamp() );

        return lightEntity.build();
    }

    @Override
    public Light lightEntityToLightMapper(LightEntity lightEntity) {
        if ( lightEntity == null ) {
            return null;
        }

        LightBuilder light = Light.builder();

        light.id( lightEntity.getId() );
        light.userId( lightEntity.getUserId() );
        light.value( lightEntity.getValue() );
        light.timestamp( lightEntity.getTimestamp() );

        return light.build();
    }

    @Override
    public List<LightEntity> lightListToLightEntityList(List<Light> lightList) {
        if ( lightList == null ) {
            return null;
        }

        List<LightEntity> list = new ArrayList<LightEntity>( lightList.size() );
        for ( Light light : lightList ) {
            list.add( lightToLightEntityMapper( light ) );
        }

        return list;
    }

    @Override
    public List<Light> lightEntityListToLightList(List<LightEntity> lightEntityList) {
        if ( lightEntityList == null ) {
            return null;
        }

        List<Light> list = new ArrayList<Light>( lightEntityList.size() );
        for ( LightEntity lightEntity : lightEntityList ) {
            list.add( lightEntityToLightMapper( lightEntity ) );
        }

        return list;
    }
}
