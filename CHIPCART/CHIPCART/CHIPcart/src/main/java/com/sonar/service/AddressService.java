package com.sonar.service;

import java.util.List;

import com.sonar.model.Address;

 public interface AddressService {

	public void addAddress(Address a);	
	public List<Address> listAddress();
	public Address getAddressByCustomerId(Integer id);
	public void removeAddress(int id);
}
