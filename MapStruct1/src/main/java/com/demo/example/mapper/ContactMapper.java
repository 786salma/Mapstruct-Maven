package com.demo.example.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.demo.example.pojo.BusinessContact;
import com.demo.example.pojo.PrimaryContact;

@Mapper
@DecoratedWith(ContactMapperDecorator.class)
public interface ContactMapper {
 ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
    
 /**
  * We define only those mappings which doesn't have same signature in source and target
  */   
    @Mappings({ 
     @Mapping(source = "phone", target = "businessPhone"),
     @Mapping(source = "email", target = "businessEmail"),
     @Mapping(target = "businessCountry", constant="INDIA")
    })
    BusinessContact primaryToBusinessContact(PrimaryContact primary);
    @InheritInverseConfiguration
    PrimaryContact businessToPrimaryContact(BusinessContact business);
   
}

