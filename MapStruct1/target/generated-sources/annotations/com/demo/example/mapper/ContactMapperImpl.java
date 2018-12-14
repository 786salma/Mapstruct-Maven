package com.demo.example.mapper;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-12-14T15:30:26+0530",
    comments = "version: 1.1.0.Beta1, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
public class ContactMapperImpl extends ContactMapperDecorator implements ContactMapper {

    private final ContactMapper delegate;

    public ContactMapperImpl() {
        this( new ContactMapperImpl_() );
    }

    private ContactMapperImpl(ContactMapperImpl_ delegate) {
        super( delegate );
        this.delegate = delegate;
    }
}
