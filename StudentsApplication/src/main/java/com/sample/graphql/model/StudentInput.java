package com.sample.graphql.model;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentInput {
	private String name;
	private int age;
	private String phone;
	
	@Autowired
	private AddressInput  addressInput;

	public StudentInput(String name, int age, String phone, AddressInput addressinput) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addressInput = addressInput;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public AddressInput getAddressinput() {
		return addressInput;
	}

	public void setAddressinput(AddressInput addressinput) {
		this.addressInput = addressinput;
	}
	
	
	
}
