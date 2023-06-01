package com.wiley.springcore.autowire.annotation;

import java.util.List;

public class EmpAnnotation {
	
	private List<Integer> phones;
	
	
   
	public List<Integer> getPhones() {
		return phones;
	}

	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}

	private AddressAnnotation address;

	public AddressAnnotation getAddress() {
		return address;
	}

	public void setAddress(AddressAnnotation address) {
		this.address = address;
	}

	public EmpAnnotation(List<Integer> phones, AddressAnnotation address) {
		super();
		this.phones = phones;
		this.address = address;
	}

	public EmpAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
