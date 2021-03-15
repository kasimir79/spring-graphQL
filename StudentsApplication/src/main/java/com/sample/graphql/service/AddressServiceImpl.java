package com.sample.graphql.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.graphql.model.Address;
import com.sample.graphql.model.Student;

@Service
public class AddressServiceImpl implements AddressService {

	List<Address> addresses=new ArrayList<>();
	
	@Override
	public Address createAddress(Address address) {
		addresses.add(address);
		return address;
	}
	public List<Address> getAddresses(){
		return addresses;
	}

}
