package com.sample.graphql.service;

import java.util.List;

import com.sample.graphql.model.Address;

public interface AddressService {
	
	public Address createAddress(Address address);
	
	public List<Address> getAddresses();

}
