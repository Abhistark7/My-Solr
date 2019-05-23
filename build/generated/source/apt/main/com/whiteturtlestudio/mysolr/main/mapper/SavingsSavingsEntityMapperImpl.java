package com.whiteturtlestudio.mysolr.main.mapper;

import com.whiteturtlestudio.mysolr.main.bos.Savings;
import com.whiteturtlestudio.mysolr.main.bos.Savings.SavingsBuilder;
import com.whiteturtlestudio.mysolr.main.models.SavingsEntity;
import com.whiteturtlestudio.mysolr.main.models.SavingsEntity.SavingsEntityBuilder;
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
public class SavingsSavingsEntityMapperImpl implements SavingsSavingsEntityMapper {

    @Override
    public SavingsEntity savingsToSavingsEntityMapper(Savings savings) {
        if ( savings == null ) {
            return null;
        }

        SavingsEntityBuilder savingsEntity = SavingsEntity.builder();

        savingsEntity.id( savings.getId() );
        savingsEntity.userId( savings.getUserId() );
        savingsEntity.value( savings.getValue() );

        return savingsEntity.build();
    }

    @Override
    public Savings savingsEntityToSavingsMapper(SavingsEntity savingsEntity) {
        if ( savingsEntity == null ) {
            return null;
        }

        SavingsBuilder savings = Savings.builder();

        savings.id( savingsEntity.getId() );
        savings.userId( savingsEntity.getUserId() );
        savings.value( savingsEntity.getValue() );

        return savings.build();
    }

    @Override
    public List<Savings> savingsEntityListToSavingsListMapper(List<SavingsEntity> savingsEntityList) {
        if ( savingsEntityList == null ) {
            return null;
        }

        List<Savings> list = new ArrayList<Savings>( savingsEntityList.size() );
        for ( SavingsEntity savingsEntity : savingsEntityList ) {
            list.add( savingsEntityToSavingsMapper( savingsEntity ) );
        }

        return list;
    }

    @Override
    public List<SavingsEntity> savingsListToSavingsEntityMapper(List<Savings> savingsList) {
        if ( savingsList == null ) {
            return null;
        }

        List<SavingsEntity> list = new ArrayList<SavingsEntity>( savingsList.size() );
        for ( Savings savings : savingsList ) {
            list.add( savingsToSavingsEntityMapper( savings ) );
        }

        return list;
    }
}
