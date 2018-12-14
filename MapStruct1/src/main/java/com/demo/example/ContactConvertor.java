package com.demo.example;

import com.demo.example.mapper.ContactMapper;
import com.demo.example.pojo.BusinessContact;
import com.demo.example.pojo.PrimaryContact;

public class ContactConvertor {
	public static void main(String[] args) {
		  PrimaryContact primary = new PrimaryContact("Shaik Salma","9999999999","salma@dev.com");
		  BusinessContact business = ContactMapper.INSTANCE.primaryToBusinessContact(primary);
		  System.out.println(business);
		  PrimaryContact primaryConverted = ContactMapper.INSTANCE.businessToPrimaryContact(business);
		  System.out.println(primaryConverted);
		 }
	}


