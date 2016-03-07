package com.tutorialspoint.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Required;

public class JavaCollection {

	List addressList;
	Map addressMap;
	Properties addressProp;

	public List getAddressList() {
		System.out.println("list : " + addressList);
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Map getAddressMap() {
		System.out.println("map : " + addressMap);
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		System.out.println("prop : " + addressProp);
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

}
