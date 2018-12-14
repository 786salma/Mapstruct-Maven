package com.demo.example.mapper;

import com.demo.example.pojo.BusinessContact;
import com.demo.example.pojo.PrimaryContact;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-14T15:30:26+0530",
    comments = "version: 1.1.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class ContactMapperImpl_ implements ContactMapper {

    @Override
    public BusinessContact primaryToBusinessContact(PrimaryContact primary) {
        if ( primary == null ) {
            return null;
        }

        BusinessContact businessContact = new BusinessContact();

        businessContact.setBusinessEmail( primary.getEmail() );
        businessContact.setBusinessPhone( primary.getPhone() );

        businessContact.setBusinessCountry( "INDIA" );

        return businessContact;
    }

    @Override
    public PrimaryContact businessToPrimaryContact(BusinessContact business) {
        if ( business == null ) {
            return null;
        }

        PrimaryContact primaryContact = new PrimaryContact();

        primaryContact.setPhone( business.getBusinessPhone() );
        primaryContact.setEmail( business.getBusinessEmail() );

        return primaryContact;
    }
}
