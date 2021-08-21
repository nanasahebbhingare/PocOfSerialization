package com.serialization;

//If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
public class Address extends Employee {
	private static final long serialVersionUID = 1L;
}
