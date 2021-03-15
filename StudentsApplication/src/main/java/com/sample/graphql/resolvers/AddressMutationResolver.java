package com.sample.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.graphql.model.Address;
import com.sample.graphql.service.AddressService;
import com.sample.graphql.service.StudentService;
@Component
public class AddressMutationResolver implements GraphQLMutationResolver {
	
	 @Autowired
	    private AddressService addressService;
	 
	public Address  createAddress(String street,String city,int zipcode) {
		return addressService.createAddress(new Address(street,city,zipcode));
		
	}

}
