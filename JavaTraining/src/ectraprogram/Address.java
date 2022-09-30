package com.abcsolition.timesheet;

public class Address {
	private String street;
	private String city;
	private String state;
	private String pin;
	public Address(String street, String city, String state, String pin) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address";
		}
	
}
