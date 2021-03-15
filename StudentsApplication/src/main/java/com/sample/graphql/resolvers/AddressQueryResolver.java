package com.sample.graphql.resolvers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.model.Address;
import com.sample.graphql.service.AddressService;

@Component
public class AddressQueryResolver implements GraphQLQueryResolver {
	
	@Autowired
    private AddressService addressService;
	
	public List<Address> getAddresses(){
		return  addressService.getAddresses();
	}

}
